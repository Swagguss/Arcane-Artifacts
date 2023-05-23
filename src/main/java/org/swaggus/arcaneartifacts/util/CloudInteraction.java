package org.swaggus.arcaneartifacts.util;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CloudInteraction {

    public static void register() {
        UseItemCallback.EVENT.register(CloudInteraction::onUseItem);
    }

    private static TypedActionResult<ItemStack> onUseItem(PlayerEntity player, World world, Hand hand) {
        // Check if the player is in the Overworld dimension (where clouds exist)
        if (!world.isClient && world.getRegistryKey() == World.OVERWORLD) {
            // Get cloud height (default: 128) and a threshold (e.g., 10 blocks)
            int cloudHeight = 196;
            int threshold = 10;

            // Check if the player's Y position is within the threshold from the cloud height
            if (Math.abs(player.getY() - cloudHeight) <= threshold) {
                // Perform the desired action when a right-click is detected near the cloud height
                System.out.println("Right-click near cloud height detected");
            }
        }

        // Return PASS to allow other event listeners to handle the event or the item to be used normally
        return TypedActionResult.pass(player.getStackInHand(hand));
    }
}
