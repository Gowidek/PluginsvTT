package dawidos506.dcase.cmds;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dawidos506.dcase.Main;

public class PremiumcaseCommand implements CommandExecutor, Listener {
	
	public static Inventory pr = Bukkit.createInventory(null, 36, "§4§lPREMIUM CASE");
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("premium")) {
			if(!(sender instanceof Player)) sender.sendMessage(Main.prefix + " §4Tylko gracze maja dostep do tej komendy!");
			else {
				Player p = (Player)sender;
				setitems();
				p.openInventory(pr);
			}
		}
		return false;
	}
	
	private void setitems() {
		ItemStack item1 = new ItemStack(Material.STONE);{
			ItemMeta im = item1.getItemMeta();
			im.setDisplayName("§4Item1");
			item1.setItemMeta(im);
		}
		ItemStack item2 = new ItemStack(Material.GRASS);{
			ItemMeta im = item2.getItemMeta();
			im.setDisplayName("§4Item2");
			item2.setItemMeta(im);
		}
		ItemStack item3 = new ItemStack(Material.APPLE);{
			ItemMeta im = item3.getItemMeta();
			im.setDisplayName("§4Item3");
			item3.setItemMeta(im);
		}
		pr.setItem(3, item1);
		pr.setItem(4, item2);
		pr.setItem(5, item3);
	}
	
	@EventHandler
	public void inv(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		ItemStack clicked = e.getCurrentItem();
		
		e.setCancelled(true);
	}

}
