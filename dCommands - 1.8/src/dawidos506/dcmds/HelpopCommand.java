package dawidos506.dcmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpopCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("helpop")) {
			if(!(sender instanceof Player)) sender.sendMessage(Main.prefix + " §4Ta komenda jest dostepna tylko dla graczy!");
			else {
				Player p = (Player)sender;
				if(!(args.length < 1)) {
					StringBuilder builder = new StringBuilder();
					for(int i = 0; i < args.length; i++) {
						builder.append(args[i] + " ");
					}
					for(Player t : Bukkit.getOnlinePlayers()) {
						if(t.hasPermission("dcmds.helpop.receive")) {
							t.sendMessage("§8[§4§lHELPOP§8] §a" + p.getDisplayName() + " §c" + builder.toString().trim());
						}
					}
					p.sendMessage(Main.prefix + " §aPomyslnie wyslano wiadomosc do administracji!");
				}
				else p.sendMessage(Main.prefix + " §4Poprawne uzycie: §6/helpop <wiadomosc>");
			}
		}
		return false;
	}

}
