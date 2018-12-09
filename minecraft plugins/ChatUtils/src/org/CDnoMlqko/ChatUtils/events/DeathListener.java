package org.CDnoMlqko.ChatUtils.events;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener{
	
	Main plugin;
	
	public DeathListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void OnPlayerDeath(PlayerDeathEvent e)
	{
		Player killer = e.getEntity().getKiller();
		Player player = e.getEntity();
		killer.sendMessage(Utils.chat("&f[&a*&f] You have slain " + player.getName()));
		player.sendMessage(Utils.chat("&f[&c*&f] You have been slain by " + killer.getName()));
		e.setDeathMessage("");
	}
	
}
