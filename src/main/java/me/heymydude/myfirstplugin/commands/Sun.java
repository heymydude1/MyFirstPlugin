package me.heymydude.myfirstplugin.commands;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Sun {
      public Sun()
     {
        new CommandBase("sun", true) {

            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;


                ItemStack item = new ItemStack(Material.SUNFLOWER);
                ItemMeta meta = item.getItemMeta();
                if (meta != null) {
                    meta.setDisplayName("Hello World");
                    meta.setUnbreakable(true);
                   // Integer GoldenDrachma = 124321;
                    meta.setCustomModelData(123);
                    List<String> lore = new ArrayList<>();  //Arrays.asList("", "");
                    lore.add("Test");
                    lore.add("Test 2");
                    lore.add("Test 3");
                    lore.add("Test 4");

                    meta.setLore(lore);
                    item.setItemMeta(meta);

                }

                player.getInventory().addItem(item);


                return true;
            }

            @Override
            public String getUsage() {
                return "/sun";
            }

        }.enableDelay(2);
   }
}
