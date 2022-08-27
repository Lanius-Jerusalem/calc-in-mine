package me.knolex.secondplugin;

import me.knolex.secondplugin.Commands.Message;
import me.knolex.secondplugin.Commands.MessageCmpleter;
import me.knolex.secondplugin.Commands.calculator;
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
