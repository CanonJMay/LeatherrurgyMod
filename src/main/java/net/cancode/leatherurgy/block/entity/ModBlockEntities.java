package net.cancode.leatherurgy.block.entity;

import net.cancode.leatherurgy.Leatherrurgy;
import net.cancode.leatherurgy.block.ModBlocks;
import net.cancode.leatherurgy.block.entity.custom.TanningVatBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<TanningVatBlockEntity> TANNING_VAT_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Leatherrurgy.MOD_ID, "tanning_block_be"),
                    BlockEntityType.Builder.create(TanningVatBlockEntity::new, ModBlocks.SPRUCE_TANNING_VAT).build(null));


    public static void registerBlockEntities() {
        Leatherrurgy.LOGGER.info("Registering Block Entities for" + Leatherrurgy.MOD_ID);
    }
}
