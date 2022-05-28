package me.heymydude.myfirstplugin.commands;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sword {
      public Sword()
     {
        new CommandBase("sword", true) {

            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;


                ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1, (byte) 1 );
                ItemMeta meta = item.getItemMeta();
                if (meta != null) {
                    meta.setDisplayName("Hello World");
                    meta.setUnbreakable(true);

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
                return "/sword";
            }

        }.enableDelay(2);
   }
}
