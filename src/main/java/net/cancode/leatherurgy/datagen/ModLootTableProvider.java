package net.cancode.leatherurgy.datagen;

import net.cancode.leatherurgy.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LEATHER_BLOCK);
        addDrop(ModBlocks.SPRUCE_TANNING_VAT);
        addDrop(ModBlocks.ACACIA_TANNING_VAT);
        addDrop(ModBlocks.BIRCH_TANNING_VAT);
        addDrop(ModBlocks.OAK_TANNING_VAT);
        addDrop(ModBlocks.DARK_OAK_TANNING_VAT);
        addDrop(ModBlocks.JUNGLE_TANNING_VAT);
        addDrop(ModBlocks.CHERRY_TANNING_VAT);
        addDrop(ModBlocks.MANGROVE_TANNING_VAT);
        addDrop(ModBlocks.DRYING_RACK);
    }
}
