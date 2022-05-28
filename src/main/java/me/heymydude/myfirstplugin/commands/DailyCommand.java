package me.heymydude.myfirstplugin.commands;

import me.heymydude.myfirstplugin.ItemCreator;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DailyCommand {
    public DailyCommand()
    {

        new CommandBase("daily", true) {
            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;

                ItemCreator item = new ItemCreator(Material.SUNFLOWER.isItem());
                item.setName("&6&lGolden Drachma");
                item.addLore("&eTrade this to Al for cool items!");
                item.addLore("");
                item.addLore("Drachmas were a currency used by");
                item.addLore("the Ancient Greeks long ago, first");
                item.addLore("introduced in 1832 by the Greek");
                item.addLore("King Otto.");
                item.setUnbreakable(true);
                player.getInventory().addItem(item.getItemStack());

                return true;
            }

            @Override
            public String getUsage() {
                return "/daily";
            }
        };
    }
}



