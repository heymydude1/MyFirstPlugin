package me.heymydude.myfirstplugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class ShearSheepListener implements Listener
{
    @EventHandler
    public void onSheepShear(BlockPlaceEvent e) {

        //get the player who sheared the sheep
        Player player = e.getPlayer();

        //check to see if the entity that was sheared was a sheep
        //if it was, cancel the event to prevent it from being sheared
        //if it wasn't, let it be sheared
        if  (e.getBlockPlaced().getType() == Material.ACACIA_BOAT) {
            player.sendMessage("This is a sheep. You can't do that.");
            e.setCancelled(true); //cancel the event. Provided by Cancellable interface
        } else {
            player.sendMessage("This is not a sheep.");
        }
    }
}
/// TODO: 5/28/2022 Change This
