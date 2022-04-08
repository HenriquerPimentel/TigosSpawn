package pt.henriquepimentel.tigosspawn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pt.henriquepimentel.tigosspawn.utils.configFile;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage(configFile.getStringF("Spawn"));

        if (!(sender instanceof Player)) {
            sender.sendMessage("Comando para jogadores!");
            return true;
        } else {
            Player player = (Player) sender;
            sender.sendMessage(player.getLocation().toString());



        }


        return false;
    }

}
