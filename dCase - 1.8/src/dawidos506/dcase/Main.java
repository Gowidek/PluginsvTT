package dawidos506.dcase;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dawidos506.dcase.cmds.PremiumcaseCommand;
import dawidos506.dcase.events.OpenPremiumcase;

public class Main extends JavaPlugin {
	
	public static Main inst;
	public static String prefix = "§8[§cd§aCase§8]";
	public static ItemStack prcase = IS.createItemStack(Material.CHEST, 1, "§a§lPremium Case", IS.createLore("§bPostaw na ziemi aby otworzyc", "Drop sprawdzisz pod komenda /premium"));
	

	public void onEnable() {
		inst = this;
		System.out.println("Uruchamianie...");
		
		registerCommands();
		registerEvents();
		registerConfig();
	}
	public void onDisable() {
		System.out.println("Wylaczanie...");
	}
	
	private void registerCommands() {
		getCommand("premium").setExecutor(new PremiumcaseCommand());
	}
	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new PremiumcaseCommand(), this);
		pm.registerEvents(new OpenPremiumcase(), this);
	}
	private void registerConfig() {
		saveDefaultConfig();
	}
	
	public static Main getInst() {
		return inst;
	}

}
