package net.cancode.leatherurgy.util;

import net.cancode.leatherurgy.Leatherrurgy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Leatherrurgy.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RAW_HIDE = createTag("raw_hide");
        public static final TagKey<Item> SOAKED_HIDE = createTag("soaked_hide");
        public static final TagKey<Item> TANNED_HIDE = createTag("tanned_hide");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Leatherrurgy.MOD_ID, name));
        }
    }
}
