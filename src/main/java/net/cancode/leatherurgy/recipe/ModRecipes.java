package net.cancode.leatherurgy.recipe;

import net.cancode.leatherurgy.Leatherrurgy;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<TanningVatRecipe> TANNING_VAT_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Leatherrurgy.MOD_ID, "tanning_vat"),
                    new TanningVatRecipe.Serializer());
    public static final RecipeType<TanningVatRecipe> TANNING_VAT_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Leatherrurgy.MOD_ID, "tanning_vat"), new RecipeType<TanningVatRecipe>() {
                @Override
                public String toString() {
                    return "tanning_vat";
                }});

    public static final RecipeSerializer<DryingRackRecipe> DRYING_RACK_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Leatherrurgy.MOD_ID, "drying_rack"),
            new DryingRackRecipe.Serializer());
    public static final RecipeType<DryingRackRecipe> DRYING_RACK_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Leatherrurgy.MOD_ID, "drying_rack"), new RecipeType<DryingRackRecipe>() {
                @Override
                public String toString() {
                    return "drying_rack";
                }});


    public static void registerRecipes() {
        Leatherrurgy.LOGGER.info("Registering Recipes for " + Leatherrurgy.MOD_ID);
    }
}
