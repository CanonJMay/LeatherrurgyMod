package net.cancode.leatherurgy.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.cancode.leatherurgy.Leatherrurgy;
import net.cancode.leatherurgy.block.ModBlocks;
import net.cancode.leatherurgy.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEATHER_BLOCK, Items.LEATHER);
        offerShapelessRecipe(exporter, Items.LEATHER, ModBlocks.LEATHER_BLOCK, "leather_block_to_leather", 4);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.SPRUCE_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "spruce_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.OAK_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "oak_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.DARK_OAK_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "dark_oak_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.BIRCH_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "birch_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.MANGROVE_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "mangrove_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.CHERRY_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "cherry_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.ACACIA_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "acacia_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_TANNING_VAT)
                .pattern("I I")
                .pattern("WCW")
                .pattern("WWW")
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CAULDRON)
                .input('W', Items.JUNGLE_PLANKS)
                .criterion("has_soaked_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "jungle_tanning_vat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRYING_RACK)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("LLL")
                .input('S', Items.STICK)
                .input('R', Items.STRING)
                .input('L', ItemTags.WOODEN_SLABS)
                .criterion("has_tanned_hide", InventoryChangedCriterion.Conditions.items(
                        ModItems.LARGE_SOAKED_HIDE,
                        ModItems.MEDIUM_SOAKED_HIDE,
                        ModItems.SMALL_SOAKED_HIDE
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "drying_rack"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEATHER_CORD, 4)
                .pattern("L")
                .pattern("L")
                .pattern("L")
                .input('L', Items.LEATHER)
                .criterion("has_leather", InventoryChangedCriterion.Conditions.items(
                        ModItems.LEATHER_CORD,
                        Items.LEATHER
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "leather_cord_vertical"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEATHER_CORD, 4)
                .pattern("LLL")
                .input('L', Items.LEATHER)
                .criterion("has_leather", InventoryChangedCriterion.Conditions.items(
                        ModItems.LEATHER_CORD,
                        Items.LEATHER
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "leather_cord_horizontal"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COMPOSITE_BOW, 1)
                .pattern("TIS")
                .pattern("L S")
                .pattern("TIS")
                .input('I', Items.IRON_NUGGET)
                .input('S', Items.STRING)
                .input('L', Items.LEATHER)
                .input('T', Items.STICK)
                .criterion("has_bow_mats", InventoryChangedCriterion.Conditions.items(
                        Items.LEATHER,
                        Items.IRON_INGOT,
                        Items.IRON_NUGGET,
                        Items.STICK,
                        Items.STRING
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "composite_bow"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING, 1)
                .pattern("L")
                .pattern("L")
                .input('L', ModItems.LEATHER_CORD)
                .criterion("has_leather", InventoryChangedCriterion.Conditions.items(
                        ModItems.LEATHER_CORD,
                        Items.STRING
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "string_vertical"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STRING, 1)
                .pattern("LL")
                .input('L', ModItems.LEATHER_CORD)
                .criterion("has_leather", InventoryChangedCriterion.Conditions.items(
                        ModItems.LEATHER_CORD,
                        Items.STRING
                ))
                .offerTo(exporter, Identifier.of(Leatherrurgy.MOD_ID, "string_horizontal"));
    }
}
