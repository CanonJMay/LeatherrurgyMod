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

public record TanningVatRecipe(Ingredient inputItemHide, Ingredient inputItemLog, ItemStack output) implements Recipe<TanningVatRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(0, this.inputItemHide);
        list.add(1, this.inputItemLog);
        return list;
    }

    // Only if you want client-side preview to match server-side logic.
    @Override
    public boolean matches(TanningVatRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItemHide.test(input.getStackInSlot(0)) && inputItemLog.test(input.getStackInSlot(1));
    }


    @Override
    public ItemStack craft(TanningVatRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
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
        return ModRecipes.TANNING_VAT_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.TANNING_VAT_TYPE;
    }

    public static class Serializer implements RecipeSerializer<TanningVatRecipe>{
        public static final MapCodec<TanningVatRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient1").forGetter(TanningVatRecipe::inputItemHide),
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient2").forGetter(TanningVatRecipe::inputItemLog),
                ItemStack.CODEC.fieldOf("result").forGetter(TanningVatRecipe::output)
        ).apply(inst, TanningVatRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TanningVatRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TanningVatRecipe::inputItemHide,
                        Ingredient.PACKET_CODEC, TanningVatRecipe::inputItemLog,
                        ItemStack.PACKET_CODEC, TanningVatRecipe::output,
                        TanningVatRecipe::new);


        @Override
        public MapCodec<TanningVatRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TanningVatRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
