package me.heymydude.myfirstplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class EXPBottleBreakListener implements Listener
{
    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e){
        //get the block that the bottle was thrown on
        //and break it.
        //This didn't work
        //Block block = e.getHitBlock();
        //block.breakNaturally();

        //stop the bubbles from showing when throwing down the XP bottle
        e.setShowEffect(false);

    }

}


