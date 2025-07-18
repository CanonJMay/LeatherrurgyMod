package net.cancode.leatherurgy.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record DryingRackRecipe (Ingredient inputItem, ItemStack output) implements Recipe<DryingRackRecipeInput> {
    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }


    @Override
    public boolean matches(DryingRackRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.input());
    }

    @Override
    public ItemStack craft(DryingRackRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.DRYING_RACK_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.DRYING_RACK_TYPE;
    }

    public static class Serializer implements RecipeSerializer<DryingRackRecipe> {
        public static final MapCodec<DryingRackRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(DryingRackRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(DryingRackRecipe::output)
        ).apply(inst, DryingRackRecipe::new));

        public static final PacketCodec<RegistryByteBuf, DryingRackRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, DryingRackRecipe::inputItem,
                        ItemStack.PACKET_CODEC, DryingRackRecipe::output,
                        DryingRackRecipe::new);

        @Override
        public MapCodec<DryingRackRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, DryingRackRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
