package me.heymydude.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor
{


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

     //chooses what world ur in
        if (sender instanceof Player p){
            if (p.getWorld().getName().equalsIgnoreCase("Bedwars_Lobby")) {




            //See if they are invulnerable (can't be hurt)
            if (p.isInvulnerable()){
                //since they are, disable it and send them a message
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "God mode is disabled.");
            }else{
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "God mode is enabled.");
            }

        }else{
            System.out.println("Only a player can run this command");
        }

        return true;
    }
        return true;
    };
}
