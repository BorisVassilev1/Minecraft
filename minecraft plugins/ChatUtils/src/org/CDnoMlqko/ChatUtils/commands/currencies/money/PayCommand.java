package org.CDnoMlqko.ChatUtils.commands.currencies.money;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.scoreboard.SidebarManager;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PayCommand implements CommandExecutor{

	Main plugin;
	
	public PayCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("pay").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player reciever = Bukkit.getPlayer(args[0]);
			int amt = Integer.parseInt(args[1]);
			if(ScoreboardDataManager.scoreboardData.get(sender.getName()).getMoney() >= amt)
			{
				ScoreboardDataManager.scoreboardData.get(sender.getName()).addMoney(-amt);;
				SidebarManager.refreshSidebarInfo((Player)sender);
				ScoreboardDataManager.scoreboardData.get(reciever.getName()).addMoney(amt);
				SidebarManager.refreshSidebarInfo(reciever);
				sender.sendMessage(Utils.chat("Successfully transferred $" + amt + " to " + reciever.getName()));
				reciever.sendMessage(Utils.chat(sender.getName() + " has given you $" + amt + "!"));
			}
			else
			{
				sender.sendMessage("You don't have enough money to perform this transfer!");
			}
		}
		else
		{
			sender.sendMessage("You have to be a player to perform this command");
		}
		return false;
	}
	

}
