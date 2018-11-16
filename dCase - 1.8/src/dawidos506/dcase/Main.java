package dawidos506.dcase;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dawidos506.dcase.cmds.PremiumcaseCommand;

public class Main extends JavaPlugin {
	
	public static Main inst;
	public static String prefix = "§8[§cd§aCase§8]";
	
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
	}
	private void registerConfig() {
		saveDefaultConfig();
	}

}
