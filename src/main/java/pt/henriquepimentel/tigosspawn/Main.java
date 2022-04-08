package pt.henriquepimentel.tigosspawn;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin ativado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desativado!");
    }

}
