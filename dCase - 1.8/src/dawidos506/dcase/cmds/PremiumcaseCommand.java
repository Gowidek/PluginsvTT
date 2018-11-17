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

import dawidos506.dcase.IS;
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
		ItemStack item1 = IS.createItemStack(Material.STONE, 64, "§aKamien", IS.createLore("§bNa drop kamienia masz 20%"));
		ItemStack item2 = IS.createItemStack(Material.GRASS, 64, "§aTrawa", IS.createLore("§bNa drop trawy masz 40%"));
		ItemStack item3 = IS.createItemStack(Material.DIRT, 64, "§aZiemia", IS.createLore("§bNa drop ziemi masz 40%"));
		ItemStack give = IS.createItemStack(Material.CHEST, 1, "§aCase", IS.createLore("§bKliknij, aby wziac §a§lPremium Case"));
		pr.setItem(3, item1);
		pr.setItem(4, item2);
		pr.setItem(5, item3);
		pr.setItem(31, give);
	}
	
	@EventHandler
	public void inv(InventoryClickEvent e) {		
		Inventory i = e.getInventory();
		ItemStack clicked = e.getCurrentItem();
		Player p = (Player)e.getWhoClicked();
		
		if(i.getName().equals(pr.getName())) e.setCancelled(true);
		
		if(clicked.getItemMeta().getDisplayName().equals("§aCase")) {
			p.getInventory().addItem(Main.prcase);
		}
	}

}
