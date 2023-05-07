package org.swaggus.arcaneartifacts;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.ITEM;

public class Artifacts {
    public static final Item EARTHEN_RUNESTONE = new EarthenRunestone(new Item.Settings().group(ArcaneArtifacts.ARCANE_ARTIFACTS_GROUP));
    public static final Item ARID_RUNESTONE = new AridRunestone(new Item.Settings().group(ArcaneArtifacts.ARCANE_ARTIFACTS_GROUP));
    public static final Item FIERY_RUNESTONE = new FieryRunestone(new Item.Settings().group(ArcaneArtifacts.ARCANE_ARTIFACTS_GROUP));
    public static final Item AQUATIC_RUNESTONE = new AquaticRunestone(new Item.Settings().group(ArcaneArtifacts.ARCANE_ARTIFACTS_GROUP));
    public static final Item AETHERIAL_RUNESTONE = new AetherialRunestone(new Item.Settings().group(ArcaneArtifacts.ARCANE_ARTIFACTS_GROUP));

    public static void registerArtifacts() {
        Registry.register(ITEM, new Identifier(ArcaneArtifacts.MOD_ID, "earthen_runestone"), EARTHEN_RUNESTONE);
        Registry.register(ITEM, new Identifier(ArcaneArtifacts.MOD_ID, "arid_runestone"), ARID_RUNESTONE);
        Registry.register(ITEM, new Identifier(ArcaneArtifacts.MOD_ID, "fiery_runestone"), FIERY_RUNESTONE);
        Registry.register(ITEM, new Identifier(ArcaneArtifacts.MOD_ID, "aquatic_runestone"), AQUATIC_RUNESTONE);
        Registry.register(ITEM, new Identifier(ArcaneArtifacts.MOD_ID, "aetherial_runestone"), AETHERIAL_RUNESTONE);
    }
}