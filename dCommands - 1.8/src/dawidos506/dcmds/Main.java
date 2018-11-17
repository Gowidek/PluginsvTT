package dawidos506.dcmds;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main inst;
	public static String prefix = "§8[§cd§aCommands§8]";
	
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
		getCommand("bc").setExecutor(new BroadcastCommand());
	}
	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
	}
	private void registerConfig() {
		saveDefaultConfig();
	}
	
	public static Main getInst() {
		return inst;
	}

}
