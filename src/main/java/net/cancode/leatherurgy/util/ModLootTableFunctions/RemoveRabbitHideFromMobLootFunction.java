package net.cancode.leatherurgy.util.ModLootTableFunctions;

import com.mojang.serialization.MapCodec;
import net.cancode.leatherurgy.Leatherrurgy;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RemoveRabbitHideFromMobLootFunction implements LootFunction {
    public static final RemoveRabbitHideFromMobLootFunction INSTANCE = new RemoveRabbitHideFromMobLootFunction();

    public static LootFunctionType<RemoveRabbitHideFromMobLootFunction> TYPE;

    private RemoveRabbitHideFromMobLootFunction() {

    }

    @Override
    public LootFunctionType<? extends LootFunction> getType() {
        return TYPE;
    }

    @Override
    public ItemStack apply(ItemStack stack, LootContext ctx) {
        if (stack.isOf(Items.RABBIT_HIDE)) {

            return ItemStack.EMPTY;
        }

        return stack;
    }

    public static final MapCodec<RemoveRabbitHideFromMobLootFunction> CODEC = MapCodec.unit(RemoveRabbitHideFromMobLootFunction.INSTANCE);

    public static void register() {
        TYPE = new LootFunctionType<>(CODEC);
        Registry.register(Registries.LOOT_FUNCTION_TYPE, Identifier.of(Leatherrurgy.MOD_ID, "remove_rabbit_hide_from_mob"), TYPE);
    }
}
