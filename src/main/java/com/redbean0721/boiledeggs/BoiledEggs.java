package com.redbean0721.boiledeggs;

import org.bukkit.plugin.java.JavaPlugin;

public final class BoiledEggs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件已啟用!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("插件已禁用!");
    }
}
