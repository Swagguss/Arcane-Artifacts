package org.swaggus.arcaneartifacts;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PocketRuneCrafter extends Item {
    public PocketRuneCrafter(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use (World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }
}
