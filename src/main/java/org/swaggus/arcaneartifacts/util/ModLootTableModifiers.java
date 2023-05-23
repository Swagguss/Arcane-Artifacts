package org.swaggus.arcaneartifacts.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import org.swaggus.arcaneartifacts.Artifacts;

public class ModLootTableModifiers {
    public static final Identifier ZOMBIFIED_PIGLIN_ID
            = new Identifier("minecraft","entities/zombified_piglin");
    public static final Identifier GHAST_ID
            = new Identifier("minecraft","entities/ghast");
    public static final Identifier ZOGLIN_ID
            = new Identifier("minecraft","entities/zoglin");
    public static final Identifier PIGLIN_ID
            = new Identifier("minecraft","entities/piglin");
    public static final Identifier PIGLIN_BRUTE_ID
            = new Identifier("minecraft","entities/piglin_brute");
    public static final Identifier BLAZE_ID
            = new Identifier("minecraft","entities/blaze");
    public static final Identifier STRIDER_ID
            = new Identifier("minecraft","entities/strider");
    public static final Identifier HOGLIN_ID
            = new Identifier("minecraft","entities/hoglin");




    public static final Identifier DEEPSLATE_ID
            = new Identifier("minecraft","blocks/deepslate");
    public static final Identifier TUFF_ID
            = new Identifier("minecraft","blocks/tuff");
    public static final Identifier DEEPSLATE_DIAMOND_ID
            = new Identifier("minecraft","blocks/deepslate_diamond_ore");
    public static final Identifier DEEPSLATE_COAL_ID
            = new Identifier("minecraft","blocks/deepslate_coal_ore");
    public static final Identifier DEEPSLATE_COPPER_ID
            = new Identifier("minecraft","blocks/deepslate_copper_ore");
    public static final Identifier DEEPSLATE_EMERALD_ID
            = new Identifier("minecraft","blocks/deepslate_emerald_ore");
    public static final Identifier DEEPSLATE_GOLD_ID
            = new Identifier("minecraft","blocks/deepslate_gold_ore");
    public static final Identifier DEEPSLATE_IRON_ID
            = new Identifier("minecraft","blocks/deepslate_iron_ore");
    public static final Identifier DEEPSLATE_LAPIS_ID
            = new Identifier("minecraft","blocks/deepslate_lapis_ore");
    public static final Identifier DEEPSLATE_REDSTONE_ID
            = new Identifier("minecraft","blocks/deepslate_redstone_ore");




    public static final Identifier TREASURE_ID
            = new Identifier("minecraft", "gameplay/fishing/treasure");
    public static final Identifier ELDER_GUARDIAN_ID
            = new Identifier("minecraft", "entities/elder_guardian");
    public static final Identifier GUARDIAN_ID
            = new Identifier("minecraft", "entities/guardian");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // ========================================= FIERY RUNESTONE =========================================
            if(ZOMBIFIED_PIGLIN_ID.equals(id) || PIGLIN_ID.equals(id) || PIGLIN_BRUTE_ID.equals(id) || ZOGLIN_ID.equals(id) || HOGLIN_ID.equals(id) || BLAZE_ID.equals(id) || GHAST_ID.equals(id) || STRIDER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(Artifacts.FIERY_RUNESTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            // ========================================= EARTHEN RUNESTONE =========================================
            if(DEEPSLATE_ID.equals(id) || TUFF_ID.equals(id) || DEEPSLATE_DIAMOND_ID.equals(id) || DEEPSLATE_EMERALD_ID.equals(id) || DEEPSLATE_COPPER_ID.equals(id) || DEEPSLATE_GOLD_ID.equals(id) || DEEPSLATE_REDSTONE_ID.equals(id) || DEEPSLATE_LAPIS_ID.equals(id) || DEEPSLATE_IRON_ID.equals(id) || DEEPSLATE_COAL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(Artifacts.EARTHEN_RUNESTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            // ========================================= AQUATIC RUNESTONE =========================================
            if(TREASURE_ID.equals(id) || ELDER_GUARDIAN_ID.equals(id) || GUARDIAN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(Artifacts.AQUATIC_RUNESTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
