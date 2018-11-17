package dawidos506.dcase;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class IS {
	
	public static ItemStack createItemStack(Material material) {
		return new ItemStack(material);
	}
	public static ItemStack createItemStack(Material material, int amount) {
		return new ItemStack(material, amount);
	}
	public static ItemStack createItemStack(Material material, int amount, short data) {
		return new ItemStack(material, amount, data);
	}
	public static ItemStack createItemStack(Material material, int amount, String name) {
		ItemStack i = new ItemStack(material, amount); {
			ItemMeta im = i.getItemMeta();
			im.setDisplayName(name);
			i.setItemMeta(im);
		}
		return i;
	}
	public static ItemStack createItemStack(Material material, int amount, short data, String name) {
		ItemStack i = new ItemStack(material, amount, data); {
			ItemMeta im = i.getItemMeta();
			im.setDisplayName(name);
			i.setItemMeta(im);
		}
		return i;
	}
	public static ItemStack createItemStack(Material material, int amount, String name, List<String> lore) {
		ItemStack i = new ItemStack(material, amount); {
			ItemMeta im = i.getItemMeta();
			im.setDisplayName(name);
			im.setLore(lore);
			i.setItemMeta(im);
		}
		return i;
	}
	public static ItemStack createItemStack(Material material, int amount, short data, String name, List<String> lore) {
		ItemStack i = new ItemStack(material, amount, data); {
			ItemMeta im = i.getItemMeta();
			im.setDisplayName(name);
			im.setLore(lore);
			i.setItemMeta(im);
		}
		return i;
	}

	public static List<String> createLore(String lin1) {
		List<String> lore = new ArrayList<String>();
		lore.add(lin1);
		return lore;
	}
	public static List<String> createLore(String lin1, String lin2) {
		List<String> lore = new ArrayList<String>();
		lore.add(lin1);
		lore.add(lin2);
		return lore;
	}
	public static List<String> createLore(String lin1, String lin2, String lin3) {
		List<String> lore = new ArrayList<String>();
		lore.add(lin1);
		lore.add(lin2);
		lore.add(lin3);
		return lore;
	}
	public static List<String> createLore(String lin1, String lin2, String lin3, String lin4) {
		List<String> lore = new ArrayList<String>();
		lore.add(lin1);
		lore.add(lin2);
		lore.add(lin3);
		lore.add(lin4);
		return lore;
	}
	public static List<String> createLore(String lin1, String lin2, String lin3, String lin4, String lin5) {
		List<String> lore = new ArrayList<String>();
		lore.add(lin1);
		lore.add(lin2);
		lore.add(lin3);
		lore.add(lin4);
		lore.add(lin5);
		return lore;
	}
	
}
