package net.cancode.leatherurgy.block;

import net.cancode.leatherurgy.Leatherrurgy;
import net.cancode.leatherurgy.block.custom.TanningVatBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block LEATHER_BLOCK = registerBlock("leather_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1f).sounds(BlockSoundGroup.WOOL)));

    public static final Block SPRUCE_TANNING_VAT = registerBlock("spruce_tanning_vat",
            new TanningVatBlock(AbstractBlock.Settings.create().nonOpaque().sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Leatherrurgy.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Leatherrurgy.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        Leatherrurgy.LOGGER.info("Registering blocks for " + Leatherrurgy.MOD_ID);
    }
}
