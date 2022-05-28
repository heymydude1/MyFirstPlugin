package me.heymydude.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class DieCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //checking to see what command was run
        if (label.equalsIgnoreCase("die")){

            System.out.println("I have been run by someone.");

            //Check to see if a Player ran the command or something else
            if (sender instanceof Player p){

                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You have opted to die.");

            }else if (sender instanceof ConsoleCommandSender){

                System.out.println("The command was ran in the console.");

            }else if(sender instanceof BlockCommandSender){

                System.out.println("The command was ran by a command block.");

            }

        }

        //return true if the command was used correctly, but i generally just return true no matter what
        return true;
    }
}