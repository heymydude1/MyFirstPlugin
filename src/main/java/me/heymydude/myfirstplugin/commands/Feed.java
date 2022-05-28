package me.heymydude.myfirstplugin.commands;

import me.heymydude.myfirstplugin.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed {
    public Feed() {
        new CommandBase("feed", true) {
            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
                Msg.send(player, "☄ You have been feed");
                return true;
            }

            @Override
            public String getUsage() {
                return "/feed";
            }
        }.enableDelay(2);
    }
}
