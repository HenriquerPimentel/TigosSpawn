package pt.henriquepimentel.tigosspawn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pt.henriquepimentel.tigosspawn.utils.configFile;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage(configFile.getStringF("Spawn"));

        return true;
    }

}
