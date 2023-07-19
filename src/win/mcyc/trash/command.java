
package win.mcyc.trash;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] agrs) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, trash.getInstance().getConfig().getInt("size"), ChatColor.translateAlternateColorCodes('&', trash.getInstance().getConfig().getString("title")));
            p.openInventory(inv);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', trash.getInstance().getConfig().getString("openmessage")));
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', trash.getInstance().getConfig().getString("playermessage")));
        }
        return true;
    }
}
