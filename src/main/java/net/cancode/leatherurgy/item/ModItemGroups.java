package net.cancode.leatherurgy.item;

import net.cancode.leatherurgy.Leatherrurgy;
import net.cancode.leatherurgy.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Leatherrurgy.MOD_ID, "mod_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LARGE_RAWHIDE))
                    .displayName(Text.translatable("itemGroup.leatherrurgy.mod_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LARGE_RAWHIDE);
                        entries.add(ModItems.MEDIUM_RAWHIDE);
                        entries.add(ModItems.SMALL_RAWHIDE);

                        entries.add(ModItems.LARGE_SOAKED_HIDE);
                        entries.add(ModItems.MEDIUM_SOAKED_HIDE);
                        entries.add(ModItems.SMALL_SOAKED_HIDE);

                        entries.add(ModItems.LARGE_TANNED_HIDE);
                        entries.add(ModItems.MEDIUM_TANNED_HIDE);
                        entries.add(ModItems.SMALL_TANNED_HIDE);

                        entries.add(ModItems.LEATHER_CORD);

                        entries.add(ModItems.COMPOSITE_BOW);
                    }).build());

    public static final ItemGroup MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Leatherrurgy.MOD_ID, "mod_blocks_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DRYING_RACK))
                    .displayName(Text.translatable("itemGroup.leatherrurgy.mod_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SPRUCE_TANNING_VAT);
                        entries.add(ModBlocks.OAK_TANNING_VAT);
                        entries.add(ModBlocks.DARK_OAK_TANNING_VAT);
                        entries.add(ModBlocks.BIRCH_TANNING_VAT);
                        entries.add(ModBlocks.MANGROVE_TANNING_VAT);
                        entries.add(ModBlocks.ACACIA_TANNING_VAT);
                        entries.add(ModBlocks.CHERRY_TANNING_VAT);
                        entries.add(ModBlocks.JUNGLE_TANNING_VAT);

                        entries.add(ModBlocks.DRYING_RACK);

                        entries.add(ModBlocks.LEATHER_BLOCK);
                    }).build());



    public static void registerItemGroups() {
        Leatherrurgy.LOGGER.info("Registering Item Groups for," + Leatherrurgy.MOD_ID);
    }
}
