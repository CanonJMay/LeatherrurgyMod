package net.cancode.leatherurgy.datagen;

import net.cancode.leatherurgy.block.ModBlocks;
import net.cancode.leatherurgy.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEATHER_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LARGE_RAWHIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDIUM_RAWHIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMALL_RAWHIDE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LARGE_SOAKED_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDIUM_SOAKED_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMALL_SOAKED_HIDE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LARGE_TANNED_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDIUM_TANNED_HIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMALL_TANNED_HIDE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEATHER_CORD, Models.GENERATED);
    }
}
