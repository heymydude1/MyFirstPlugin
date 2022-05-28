package me.heymydude.myfirstplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener
{
    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){

        //set a custom join message
        event.setJoinMessage("Yo momma has joined the server. Ooooooo.");

    }
}


// Old Join Message
// getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);