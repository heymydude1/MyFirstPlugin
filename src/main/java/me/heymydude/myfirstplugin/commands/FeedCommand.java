package me.heymydude.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //Instance of pattern match to see if a Player ran the command
        if (sender instanceof Player p){

            //set the food level to max
            p.setFoodLevel(20);
            p.sendMessage(ChatColor.YELLOW + "Food level set to max.");

        }

        return true;
    }
}
