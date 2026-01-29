package net.tzimom.enderchest;

import org.bukkit.plugin.java.JavaPlugin;

import net.tzimom.enderchest.command.EnderChestCommand;

public class EnderChestPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("enderchest").setExecutor(new EnderChestCommand());
    }
}
