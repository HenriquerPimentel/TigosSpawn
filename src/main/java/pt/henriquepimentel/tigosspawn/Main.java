package pt.henriquepimentel.tigosspawn;

import org.bukkit.plugin.java.JavaPlugin;
import pt.henriquepimentel.tigosspawn.commands.SpawnCommand;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().addDefault("Spawn", "0, 0, 0");
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        getCommand("spawn").setExecutor(new SpawnCommand());

        getLogger().info("Plugin ativado!");


    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desativado!");
    }

}
