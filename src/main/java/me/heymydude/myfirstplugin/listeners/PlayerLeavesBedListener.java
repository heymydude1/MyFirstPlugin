package me.heymydude.myfirstplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerLeavesBedListener implements Listener
{

    //Event for when player leave bed
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event)
    {

        //Get the player associated with this event
        Player player = event.getPlayer();
        //send them a message so we know it works
        player.sendMessage("You left a bed!!! Dork.");

    }
}
