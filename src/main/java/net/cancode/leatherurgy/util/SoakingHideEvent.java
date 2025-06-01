package net.cancode.leatherurgy.util;

import net.cancode.leatherurgy.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.*;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoakingHideEvent implements UseBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        BlockPos pos = hitResult.getBlockPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block instanceof AbstractCauldronBlock) {
            ItemStack heldItem = player.getStackInHand(hand);
            Item resultItem = null;

            // Determine what to convert to
            if (heldItem.getItem() == ModItems.LARGE_RAWHIDE) {
                resultItem = ModItems.LARGE_SOAKED_HIDE;
            } else if (heldItem.getItem() == ModItems.MEDIUM_RAWHIDE) {
                resultItem = ModItems.MEDIUM_SOAKED_HIDE;
            } else if (heldItem.getItem() == ModItems.SMALL_RAWHIDE) {
                resultItem = ModItems.SMALL_SOAKED_HIDE;
            }

            if (resultItem != null && block instanceof LeveledCauldronBlock && state.get(LeveledCauldronBlock.LEVEL) > 0) {
                if (!world.isClient) {
                    heldItem.decrement(1); // Remove 1 rawhide

                    ItemStack soaked = new ItemStack(resultItem);
                    if (!player.getInventory().insertStack(soaked)) {
                        player.dropItem(soaked, false);
                    }

                    // Reduce water level if applicable
                    if (block instanceof LeveledCauldronBlock) {
                        int level = state.get(LeveledCauldronBlock.LEVEL);
                        if (level > 1) {
                            world.setBlockState(pos, state.with(LeveledCauldronBlock.LEVEL, level - 1));
                        } else {
                            world.setBlockState(pos, Blocks.CAULDRON.getDefaultState());
                        }
                    }
                }

                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }
}
