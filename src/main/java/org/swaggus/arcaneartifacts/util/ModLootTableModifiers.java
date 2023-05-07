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

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // ========================================= NETHER MOBS =========================================
            if(ZOMBIFIED_PIGLIN_ID.equals(id) || PIGLIN_ID.equals(id) || PIGLIN_BRUTE_ID.equals(id) || ZOGLIN_ID.equals(id) || HOGLIN_ID.equals(id) || BLAZE_ID.equals(id) || GHAST_ID.equals(id) || STRIDER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(Artifacts.FIERY_RUNESTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
