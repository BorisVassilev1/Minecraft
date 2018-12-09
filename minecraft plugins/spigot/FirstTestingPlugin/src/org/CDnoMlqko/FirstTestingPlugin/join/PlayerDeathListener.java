package org.CDnoMlqko.FirstTestingPlugin.join;

import org.CDnoMlqko.FirstTestingPlugin.Main;
import org.CDnoMlqko.FirstTestingPlugin.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener{
	@SuppressWarnings("unused")
	private Main plugin;

	public PlayerDeathListener(Main plugin) {
		this.plugin = plugin;

		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {
			Player player = e.getEntity();
			Player killer = e.getEntity().getKiller();
			
			if(player != killer)
			{
				killer.sendMessage(Utils.chat("&8[&a*&8] &7 You have killed &6" + player.getDisplayName() + "!"));
				player.sendMessage(Utils.chat("&8[&c*&8] &7 You have been killed by &6" + killer.getDisplayName() + "!"));
			}
		}
	}

}
