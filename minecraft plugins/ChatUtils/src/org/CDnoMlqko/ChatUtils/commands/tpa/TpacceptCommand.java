package org.CDnoMlqko.ChatUtils.commands.tpa;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpacceptCommand implements CommandExecutor{
	
	Main plugin;
	
	public TpacceptCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("tpaccept").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			if(ScoreboardDataManager.scoreboardData.get(sender.getName()).hasTeleportationRequestPending)
			{
				Player p = ScoreboardDataManager.scoreboardData.get(sender.getName()).getTepeportationRequest();
				p.teleport((Player)sender);
				p.sendMessage(Utils.chat(sender.getName() + "&a has accepted your teleportation request! Teleporting..."));
				ScoreboardDataManager.scoreboardData.get(sender.getName()).hasTeleportationRequestPending = false;
			}
			else
			{
				sender.sendMessage(Utils.chat("&cYou don't have a teleportation request pending!"));
			}
		}
		return false;
	}

}
