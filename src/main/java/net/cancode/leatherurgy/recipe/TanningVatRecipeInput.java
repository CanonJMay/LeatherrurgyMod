package net.cancode.leatherurgy.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record TanningVatRecipeInput(ItemStack hideInput, ItemStack logInput) implements RecipeInput {
    @Override
    public ItemStack getStackInSlot(int slot) {
        return switch (slot) {
            case 0 -> hideInput;
            case 1 -> logInput;
            default -> ItemStack.EMPTY;
        };
    }

    @Override
    public int getSize() {
        return 2;
    }
}
