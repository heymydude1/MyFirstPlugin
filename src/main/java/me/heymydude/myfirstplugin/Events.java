package me.heymydude.myfirstplugin;

import me.heymydude.myfirstplugin.item.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Events extends JavaPlugin implements Listener {



    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){

        //Get the player associated with this event
        Player player = event.getPlayer();
        //send them a message so we know it works
        player.sendMessage("You left a bed!!! Dork.");

    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.wand.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.getWorld().createExplosion(player.getLocation(), 2.0f);
                    player.sendMessage("§6You dare use the stick of truth?!");
                }
            }
        }
    }

}
