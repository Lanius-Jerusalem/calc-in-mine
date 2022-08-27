package me.knolex.firstplugin;

import me.knolex.firstplugin.commands.Message;
import me.knolex.firstplugin.commands.MessageCmpleter;
import me.knolex.firstplugin.commands.calculator;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("calculator").setExecutor(new calculator());

        getCommand("message").setExecutor(new Message());
        getCommand("message").setTabCompleter(new MessageCmpleter());
    }


    @Override
    public void onDisable() {

    }
}
