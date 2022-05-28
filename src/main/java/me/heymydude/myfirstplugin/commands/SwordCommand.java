package me.heymydude.myfirstplugin.commands;

import me.heymydude.myfirstplugin.ItemCreator;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.swing.*;

public class SwordCommand {
    public SwordCommand()
    {

        new CommandBase("nsword", true) {
            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;

                ItemCreator item = new ItemCreator(Material.SUNFLOWER, (byte) 64444444);
                item.setName("&6&lGolden Drachma");
                item.addLore("&eTrade this to Al for cool items!");
                item.addLore("");
                item.addLore("Drachmas were a currency used by");
                item.addLore("the Ancient Greeks long ago, first");
                item.addLore("introduced in 1832 by the Greek");
                item.addLore("King Otto.");
                item.setUnbreakable(true);

                player.getInventory().addItem(item.getItemStack());

//                ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
//                ItemMeta meta = item.getItemMeta();
//                if (meta != null) {
//                    meta.setDisplayName("Hello World");
//                    meta.setUnbreakable(true);
//
//                    List<String> lore = new ArrayList<>();
//                    lore.add("Test");
//                    lore.add("Test 2");
//                    lore.add("Test 3");
//
//                    meta.setLore(lore);
//                    item.setItemMeta(meta);
//                }
//
//                player.getInventory().addItem(item);
                return true;
            }

            @Override
            public String getUsage() {
                return "/nsword";
            }
        };
    }
}



