package net.fettlol.lib.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LootApi {

    private static final LootCondition.Builder WITH_SILK_TOUCH = MatchToolLootCondition.builder(ItemPredicate
        .Builder
        .create()
        .enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1)))
    );

    public static final LootCondition.Builder WITHOUT_SILK_TOUCH = WITH_SILK_TOUCH.invert();

    public static final LootFunction.Builder HIGH_LEVEL_TREASURE_ENCHANTMENT = EnchantWithLevelsLootFunction
        .builder(UniformLootNumberProvider.create(20.0f, 40.0f))
        .allowTreasureEnchantments();

    public static void addToOreLootTable(FabricLootSupplierBuilder supplier, int count, float probability, Identifier identifier) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
            .rolls(BinomialLootNumberProvider.create(count, probability))
            .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
            .withCondition(WITHOUT_SILK_TOUCH.build())
            .with(ItemEntry.builder(Registry.ITEM.get(identifier).asItem()));

        supplier.withPool(poolBuilder.build());
    }

    public static void addToOreLootTable(FabricLootSupplierBuilder supplier, int count, float probability, String item) {
        addToOreLootTable(supplier, count, probability, new Identifier(item));
    }

    // == Add to Loot tables with Fortune modifier (Mobs only) ==

    public static void addToMobLootTable(FabricLootSupplierBuilder supplier, int count, float probability, Identifier identifier) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
            .rolls(BinomialLootNumberProvider.create(count, probability))
            .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.LOOTING))
            .with(ItemEntry.builder(Registry.ITEM.get(identifier).asItem()));

        supplier.withPool(poolBuilder.build());
    }

    public static void addToMobLootTable(FabricLootSupplierBuilder supplier, int count, float probability, String item) {
        addToMobLootTable(supplier, count, probability, new Identifier(item));
    }

    // == Add to Loot tables (Chests or Mobs) ==

    public static void addToLootTable(FabricLootSupplierBuilder supplier, int count, float probability, Identifier identifier) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
            .rolls(BinomialLootNumberProvider.create(count, probability))
            .with(ItemEntry.builder(Registry.ITEM.get(identifier).asItem()));

        supplier.withPool(poolBuilder.build());
    }

    public static void addToLootTable(FabricLootSupplierBuilder supplier, int count, float probability, String item) {
        addToLootTable(supplier, count, probability, new Identifier(item));
    }

    public static void addToLootTable(FabricLootSupplierBuilder supplier, int count, float probability, String namespace, String item) {
        addToLootTable(supplier, count, probability, new Identifier(namespace, item));
    }

    // == Add to Loot tables and add a random enchantment ==

    public static void addToLootTableWithRandomEnchantment(FabricLootSupplierBuilder supplier, int count, float probability, Identifier identifier) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
            .rolls(BinomialLootNumberProvider.create(count, probability))
            .withFunction(HIGH_LEVEL_TREASURE_ENCHANTMENT.build())
            .with(ItemEntry.builder(Registry.ITEM.get(identifier).asItem()));
        supplier.withPool(poolBuilder.build());
    }

    public static void addToLootTableWithRandomEnchantment(FabricLootSupplierBuilder supplier, int count, float probability, String item) {
        addToLootTableWithRandomEnchantment(supplier, count, probability, new Identifier(item));
    }
}
