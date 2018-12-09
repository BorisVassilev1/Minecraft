package org.CDnoMlqko.ChatUtils.scoreboard;

import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class SidebarManager {
	
	public static void refreshSidebarInfo(Player p)
	{
		ScoreboardManager sbManager = Bukkit.getScoreboardManager();
		Scoreboard sb = sbManager.getNewScoreboard();
		
		Objective objective = sb.registerNewObjective("ScoreboardData", "");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName(Utils.chat("&4S&ce&6r&ev&2e&ar &bN&3a&9m&5e"));
		
		Score money = objective.getScore(Utils.chat("&6Money: &f" + Integer.toString(ScoreboardDataManager.scoreboardData.get(p.getName()).getMoney())));
		money.setScore(2);
		
		Score dust = objective.getScore(Utils.chat("&dMagic Dust: &f" + Integer.toString(ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust())));
		dust.setScore(1);
		
		p.setScoreboard(sb);
	}
	
}
