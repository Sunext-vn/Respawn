package vn.sunext.respawn.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class MainCommand implements TabExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player)
            if (sender.isOp() || sender.hasPermission("respawn.command")) {
                respawn(sender, args);
            }

        if (args.length == 1) {
            respawn(sender, args);
        }

        return false;
    }

    private void respawn(CommandSender sender, String[] args) {
        Player player = Bukkit.getPlayer(args[0]);

        if (player == null) {
            sender.sendMessage("Cannot find that player.");

            return;
        }

        player.spigot().respawn();

        sender.sendMessage("Player has been spawned.");
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }
}
