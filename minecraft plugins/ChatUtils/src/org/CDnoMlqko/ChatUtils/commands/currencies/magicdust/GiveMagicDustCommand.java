package org.CDnoMlqko.ChatUtils.commands.currencies.magicdust;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.scoreboard.SidebarManager;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveMagicDustCommand implements CommandExecutor{

	Main plugin;
	
	public GiveMagicDustCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("givemagicdust").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player) || sender.isOp())
		{
			int amt = Integer.parseInt(args[1]);
			if (amt > 0)
			{
				Player p = Bukkit.getPlayer(args[0]);
				ScoreboardDataManager.scoreboardData.get(p.getName()).addMagicDust(amt);
				SidebarManager.refreshSidebarInfo(p);
				sender.sendMessage(Utils.chat("&aSuccessfully given " + p.getName() + " &f" + amt + " &dMagic Dust."));
			}
			//else
			//{
				//sender.sendMessage(Utils.chat("&cYou can only give money to players!"));
			//}
		}
		return false;
	}
}
