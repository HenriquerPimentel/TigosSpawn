package pt.henriquepimentel.tigosspawn.utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class configFile extends JavaPlugin {

    public static final Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("TigosSpawn");


    public static String getStringF(String path) {
        return plugin.getConfig().getString(path);
    }

}
