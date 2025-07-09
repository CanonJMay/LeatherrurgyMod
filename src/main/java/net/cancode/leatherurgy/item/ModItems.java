package net.cancode.leatherurgy.item;

import net.cancode.leatherurgy.Leatherrurgy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SMALL_RAWHIDE = registerItem("small_rawhide", new Item(new Item.Settings()));
    public static final Item MEDIUM_RAWHIDE = registerItem("medium_rawhide", new Item(new Item.Settings()));
    public static final Item LARGE_RAWHIDE = registerItem("large_rawhide", new Item(new Item.Settings()));

    public static final Item SMALL_SOAKED_HIDE = registerItem("small_soaked_hide", new Item(new Item.Settings()));
    public static final Item MEDIUM_SOAKED_HIDE = registerItem("medium_soaked_hide", new Item(new Item.Settings()));
    public static final Item LARGE_SOAKED_HIDE = registerItem("large_soaked_hide", new Item(new Item.Settings()));

    public static final Item SMALL_TANNED_HIDE = registerItem("small_tanned_hide", new Item(new Item.Settings()));
    public static final Item MEDIUM_TANNED_HIDE = registerItem("medium_tanned_hide", new Item(new Item.Settings()));
    public static final Item LARGE_TANNED_HIDE = registerItem("large_tanned_hide", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Leatherrurgy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Leatherrurgy.LOGGER.info("Registering Items for " + Leatherrurgy.MOD_ID);
    }
}
