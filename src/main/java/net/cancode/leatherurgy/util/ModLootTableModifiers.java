package net.cancode.leatherurgy.util;

import net.cancode.leatherurgy.item.ModItems;
import net.cancode.leatherurgy.util.ModLootTableFunctions.RemoveLeatherFromMobLootFunction;
import net.cancode.leatherurgy.util.ModLootTableFunctions.RemoveRabbitHideFromMobLootFunction;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier COW_ID = Identifier.of("minecraft", "entities/cow");
    private static final Identifier MOOSHROOM = Identifier.of("minecraft", "entities/mooshroom");
    private static final Identifier HORSE_ID = Identifier.of("minecraft", "entities/horse");
    private static final Identifier DONKEY_ID = Identifier.of("minecraft", "entities/donkey");
    private static final Identifier MULE_ID = Identifier.of("minecraft", "entities/mule");
    private static final Identifier LLAMA_ID = Identifier.of("minecraft", "entities/llama");
    private static final Identifier TRADER_LLAMA_ID = Identifier.of("minecraft", "entities/trader_llama");
    private static final Identifier CAMEL_ID = Identifier.of("minecraft", "entities/camel");
    private static final Identifier HOGLIN_ID = Identifier.of("minecraft", "entities/hoglin");
    private static final Identifier RABBIT_ID = Identifier.of("minecraft", "entities/rabbit");

    private static final Identifier PIG_ID = Identifier.of("minecraft", "entities/pig");
    private static final Identifier FOX_ID = Identifier.of("minecraft", "entities/fox");
    private static final Identifier WOLF_ID = Identifier.of("minecraft", "entities/wolf");

    public static void modifyLootTables() {

        //Adding Hide
        LootTableEvents.MODIFY.register(((key, tableBuilder, source, register) -> {
            if(PIG_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.MEDIUM_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        }));

        LootTableEvents.MODIFY.register(((key, tableBuilder, source, register) -> {
            if(FOX_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.50f))
                        .with(ItemEntry.builder(ModItems.SMALL_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        }));

        LootTableEvents.MODIFY.register(((key, tableBuilder, source, register) -> {
            if(WOLF_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.50f))
                        .with(ItemEntry.builder(ModItems.MEDIUM_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        }));



        //Replacing Leather Drops
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (COW_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (MOOSHROOM.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (HORSE_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (DONKEY_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.MEDIUM_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (MULE_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.MEDIUM_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (LLAMA_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (TRADER_LLAMA_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (CAMEL_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveLeatherFromMobLootFunction.INSTANCE);

            if (HOGLIN_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.LARGE_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            tableBuilder.apply(RemoveRabbitHideFromMobLootFunction.INSTANCE);

            if (RABBIT_ID.equals(key.getValue())) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.50f))
                        .with(ItemEntry.builder(ModItems.SMALL_RAWHIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });
    }
    public static void registerLootTableModifications() {

    }
}
