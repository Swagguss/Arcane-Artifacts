package org.swaggus.arcaneartifacts;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.ITEM;

public class ArcaneArtifacts implements ModInitializer {
    public static final String MOD_ID = "arcaneartifacts";
    public static final ItemGroup ARCANE_ARTIFACTS_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(Artifacts.EARTHEN_RUNESTONE))
            .build();

    @Override
    public void onInitialize() {
        Artifacts.registerArtifacts();
    }
}
