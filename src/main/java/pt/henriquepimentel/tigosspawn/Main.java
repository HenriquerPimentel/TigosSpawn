package pt.henriquepimentel.tigosspawn;

import org.bukkit.plugin.java.JavaPlugin;
import pt.henriquepimentel.tigosspawn.commands.SpawnCommand;
import pt.henriquepimentel.tigosspawn.commands.setSpawn;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {



        getConfig().addDefault("Spawn.world", getServer().getWorlds().get(0).getName());
        getConfig().addDefault("Spawn.x", 0.0);
        getConfig().addDefault("Spawn.y", 0.0);
        getConfig().addDefault("Spawn.z", 0.0);
        getConfig().addDefault("Spawn.yaw", 0.0);
        getConfig().addDefault("Spawn.pitch", 0.0);

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("setspawn").setExecutor(new setSpawn());

        getLogger().info("Plugin ativado!");


    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desativado!");
    }

}
