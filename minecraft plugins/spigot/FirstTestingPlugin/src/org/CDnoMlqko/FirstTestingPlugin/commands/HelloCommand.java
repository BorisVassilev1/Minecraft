package org.CDnoMlqko.FirstTestingPlugin.commands;

import org.CDnoMlqko.FirstTestingPlugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {

	@SuppressWarnings("unused")
	private Main plugin;

	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can execute this command!");
			return true;
		}

		Player p = (Player) sender;
		if (p.hasPermission("hello.use")) {
			p.sendMessage("Hello, " + p.getName() + "!");

		} else {
			p.sendMessage("You do not have permission to run this command!");
		}

		return false;
	}

}
