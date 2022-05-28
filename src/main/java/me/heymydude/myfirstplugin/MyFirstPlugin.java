package me.heymydude.myfirstplugin;

import me.heymydude.myfirstplugin.commands.*;
import me.heymydude.myfirstplugin.listeners.EXPBottleBreakListener;
import me.heymydude.myfirstplugin.listeners.JoinLeaveListener;
import me.heymydude.myfirstplugin.listeners.PlayerLeavesBedListener;
import me.heymydude.myfirstplugin.listeners.ShearSheepListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MyFirstPlugin extends JavaPlugin {
    private static MyFirstPlugin instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        instance = this;


        System.out.println("My first plugin has started!!! Hello!!!");


        /* Registering Listeners */
        getServer().getPluginManager().registerEvents(new EXPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeavesBedListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new Events(), this);



        //Registering Commands
        Objects.requireNonNull(getCommand("god")).setExecutor(new GodCommand());
        Objects.requireNonNull(getCommand("wand")).setExecutor(new WandCommand());
        Objects.requireNonNull(getCommand("die")).setExecutor(new DieCommand());

        new DailyCommand();
        new TestSwordCommand();
        new FeedCommand();
    }



    public static MyFirstPlugin getInstance() {
        return instance;
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("My first plugin has stopped!!! Bye!!!");



    }


    // TODO: 5/20/2022 Fix Commands
}
