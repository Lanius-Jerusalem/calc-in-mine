package me.knolex.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Message implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equalsIgnoreCase( "hello")){
            sender.sendMessage("привет!");
            return true;
        }
        else if (args[0].equalsIgnoreCase( "goodbye")){
            sender.sendMessage("пока!");
            return true;
        }
        else if (args[0].equalsIgnoreCase( "whatsup")){
            sender.sendMessage("как дела?");
            return true;
        }
        return false;
    }
}
