package net.cancode.leatherurgy.datagen;

import net.cancode.leatherurgy.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public
    ModBlockTagProvider(FabricDataOutput output, CompletableFuture< RegistryWrapper.WrapperLookup > registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure (RegistryWrapper.WrapperLookup wrapperLookup){
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.LEATHER_BLOCK);
    }
}