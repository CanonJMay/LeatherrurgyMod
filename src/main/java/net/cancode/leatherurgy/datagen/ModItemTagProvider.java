package net.cancode.leatherurgy.datagen;

import net.cancode.leatherurgy.item.ModItems;
import net.cancode.leatherurgy.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.RAW_HIDE)
                .add(ModItems.LARGE_RAWHIDE)
                .add(ModItems.MEDIUM_RAWHIDE)
                .add(ModItems.SMALL_RAWHIDE);

        getOrCreateTagBuilder(ModTags.Items.SOAKED_HIDE)
                .add(ModItems.LARGE_SOAKED_HIDE)
                .add(ModItems.MEDIUM_SOAKED_HIDE)
                .add(ModItems.SMALL_SOAKED_HIDE);

        getOrCreateTagBuilder(ModTags.Items.TANNED_HIDE)
                .add(ModItems.LARGE_TANNED_HIDE)
                .add(ModItems.MEDIUM_TANNED_HIDE)
                .add(ModItems.SMALL_TANNED_HIDE);
    }
}
