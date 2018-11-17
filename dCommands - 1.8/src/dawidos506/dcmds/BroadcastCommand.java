package dawidos506.dcmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("bc")) {
			if(!(args.length < 1)) {
				StringBuilder builder = new StringBuilder();
				for(int i = 0; i < args.length; i++) {
					builder.append(args[i] + " ");
				}
				for(Player t : Bukkit.getOnlinePlayers()) {
					t.sendMessage(Main.prefix + " §4§l" + builder.toString().trim());
				}
			}
			else {
				sender.sendMessage(Main.prefix + " §4Poprawne uzycie: §6/broadcast <wiadomosc>");
			}
		}
		return false;
	}

}
