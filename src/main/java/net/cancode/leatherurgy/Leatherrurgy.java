package net.cancode.leatherurgy;

import net.cancode.leatherurgy.block.ModBlocks;
import net.cancode.leatherurgy.block.entity.ModBlockEntities;
import net.cancode.leatherurgy.item.ModItemGroups;
import net.cancode.leatherurgy.item.ModItems;
import net.cancode.leatherurgy.recipe.ModRecipes;
import net.cancode.leatherurgy.screen.ModScreenHandler;
import net.cancode.leatherurgy.util.ModLootTableFunctions.RemoveLeatherFromMobLootFunction;
import net.cancode.leatherurgy.util.ModLootTableFunctions.RemoveRabbitHideFromMobLootFunction;
import net.cancode.leatherurgy.util.ModLootTableModifiers;
import net.cancode.leatherurgy.util.ModModelPredicates;
import net.cancode.leatherurgy.util.SoakingHideEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Leatherrurgy implements ModInitializer {
	public static final String MOD_ID = "leatherrurgy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandler.registerScreenHandler();

		ModLootTableModifiers.modifyLootTables();
		RemoveLeatherFromMobLootFunction.register();
		RemoveRabbitHideFromMobLootFunction.register();

		ModModelPredicates.registerModelPredicates();

		ModRecipes.registerRecipes();

		UseBlockCallback.EVENT.register(new SoakingHideEvent());
	}
}