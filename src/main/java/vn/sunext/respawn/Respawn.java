package vn.sunext.respawn;

import org.bukkit.plugin.java.JavaPlugin;
import vn.sunext.respawn.commands.MainCommand;

import java.util.Objects;

public final class Respawn extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("respawn")).setExecutor(new MainCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
