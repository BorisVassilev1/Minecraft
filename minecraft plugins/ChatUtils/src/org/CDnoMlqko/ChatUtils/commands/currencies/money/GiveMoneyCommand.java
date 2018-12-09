package org.CDnoMlqko.ChatUtils.commands.currencies.money;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.scoreboard.SidebarManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveMoneyCommand implements CommandExecutor {

	Main plugin;

	public GiveMoneyCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("givemoney").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player) || sender.isOp())
		{
			int amt = Integer.parseInt(args[1]);
			if (amt > 0)
			{
				Player p = Bukkit.getPlayer(args[0]);
				ScoreboardDataManager.scoreboardData.get(p.getName()).addMoney(amt);
				SidebarManager.refreshSidebarInfo(p);
				sender.sendMessage("successfully given " + p.getName() + " $" + amt + ".");
			}
			else
			{
				sender.sendMessage("You can only give money to players!");
			}
		}
		return false;
	}
}
