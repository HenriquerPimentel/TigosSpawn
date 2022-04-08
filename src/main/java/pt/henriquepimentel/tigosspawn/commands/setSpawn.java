package pt.henriquepimentel.tigosspawn.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import pt.henriquepimentel.tigosspawn.utils.math;

import static pt.henriquepimentel.tigosspawn.utils.configFile.plugin;

public class setSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player!");
            return true;
        } else {
            Player player = (Player) sender;
            if (!(player.hasPermission("tigospawn.setspawn") || player.hasPermission("tigospawn.admin"))) {
                sender.sendMessage("You don't have permission!");
                return true;
            } else {
                FileConfiguration config = plugin.getConfig();
                Location location = player.getLocation();

                config.set("Spawn.world", location.getWorld().getName());
                config.set("Spawn.x", math.round(location.getX()));
                config.set("Spawn.y", math.round(location.getY()));
                config.set("Spawn.z", math.round(location.getZ()));
                config.set("Spawn.yaw", math.round(location.getYaw()));
                config.set("Spawn.pitch", math.round(location.getPitch()));
                plugin.saveConfig();

                sender.sendMessage("New spawn set!");

            }
        }

        return false;
    }
}
