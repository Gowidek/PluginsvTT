package dawidos506.dcase.events;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import dawidos506.dcase.IS;
import dawidos506.dcase.Main;

public class OpenPremiumcase implements Listener {
	
	@EventHandler
	public void place(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();
		ItemStack i = p.getItemInHand();
		
		if(i.getItemMeta().getDisplayName().equals(Main.prcase.getItemMeta().getDisplayName())) {
			Random random = new Random();
			int r = random.nextInt(99);
			
			if(r >= 0 && r <= 19) {
				e.setCancelled(true);
				p.getInventory().removeItem(Main.prcase);
				b.getWorld().dropItemNaturally(b.getLocation(), IS.createItemStack(Material.STONE, 64));
				b.getWorld().playEffect(b.getLocation(), Effect.SMOKE, 4);
				if(Main.getInst().getConfig().getBoolean("wiadomosci") == true) {
					Bukkit.broadcastMessage(Main.prefix + " §aGracz §c" + p.getName() + " §awydropil §664 STONE §az Premium Case!");
				}
			}
			else if(r >= 20 && r <= 59) {
				e.setCancelled(true);
				p.getInventory().removeItem(Main.prcase);
				b.getWorld().dropItemNaturally(b.getLocation(), IS.createItemStack(Material.GRASS, 64));
				b.getWorld().playEffect(b.getLocation(), Effect.SMOKE, 4);
				if(Main.getInst().getConfig().getBoolean("wiadomosci") == true) {
					Bukkit.broadcastMessage(Main.prefix + " §aGracz §c" + p.getName() + " §awydropil §664 GRASS §az Premium Case!");
				}
			}
			else if(r >= 60 && r <= 99) {
				e.setCancelled(true);
				p.getInventory().removeItem(Main.prcase);
				b.getWorld().dropItemNaturally(b.getLocation(), IS.createItemStack(Material.DIRT, 64));
				b.getWorld().playEffect(b.getLocation(), Effect.SMOKE, 4);
				if(Main.getInst().getConfig().getBoolean("wiadomosci") == true) {
					Bukkit.broadcastMessage(Main.prefix + " §aGracz §c" + p.getName() + " §awydropil §664 DIRT §az Premium Case!");
				}
			}
		}
	}

}
