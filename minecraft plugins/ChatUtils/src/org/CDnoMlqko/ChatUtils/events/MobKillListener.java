package org.CDnoMlqko.ChatUtils.events;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.scoreboard.SidebarManager;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobKillListener implements Listener{
	
	Main plugin;
	
	public MobKillListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onMobKill(EntityDeathEvent event)
	{
		Entity e = event.getEntity();
		
		if(e instanceof Player)
			return;
		if(e.getLastDamageCause() instanceof EntityDamageByEntityEvent)
		{
			EntityDamageByEntityEvent nEvent = (EntityDamageByEntityEvent) e.getLastDamageCause();
			if(nEvent.getDamager() instanceof Player)
			{
				if(Math.random() >= 0.9)
				{
					ScoreboardDataManager.scoreboardData.get(nEvent.getDamager().getName()).addMagicDust(1);
					SidebarManager.refreshSidebarInfo((Player) nEvent.getDamager());
					nEvent.getDamager().sendMessage(Utils.chat("&aYou recieved &f1 &dMagic Dust &afrom the &f" + e.getName() + " &aYou killed"));
				}
            }
		}
	}

}
