package me.heymydude.myfirstplugin.commands;

import me.heymydude.myfirstplugin.MyFirstPlugin;
import me.heymydude.myfirstplugin.util.ColorUtils;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import java.awt.*;

public class ColorCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            //Using Color built-in colors
            p.sendMessage(ChatColor.of(Color.PINK) + "Hey");

            //Using RGB to construct a color
            p.sendMessage(ChatColor.of(new Color(180, 193, 57)) + "Wow im so fancy");

            //Using a hexademical string value
            p.sendMessage(ChatColor.of("#a832a2") + "Work those glutes");

            //Using my superduper cool translator
            p.sendMessage(ColorUtils.translateColorCodes("&#4287f5&lStill scheming &bSurprise me &a&lboy"));

//            new BukkitRunnable(){
//                @Override
//                public void run() {
//                    for (int r = 0; r < 256; r += 5){
//                        for (int g = 0; g < 256; g += 5){
//                            for (int b = 0; b < 256; b += 5){
//                                p.sendMessage(ChatColor.of(new Color(r, g, b)) + "Color");
//                            }
//                        }
//                    }
//                }
//            }.runTaskAsynchronously(RGBColors.getPlugin());

            p.sendMessage(ColorUtils.translateColorCodes(MyFirstPlugin.getPlugin().getConfig().getString("kill-message")));

        }


        return true;
    }
}
