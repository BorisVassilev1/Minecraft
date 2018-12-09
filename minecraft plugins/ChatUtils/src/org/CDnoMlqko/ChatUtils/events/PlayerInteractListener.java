package org.CDnoMlqko.ChatUtils.events;

import org.CDnoMlqko.ChatUtils.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event.Result;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener{
	
	Main plugin;
	
	public PlayerInteractListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void OnInteractWithCustomEnchantmentsTable(PlayerInteractEvent e)
	{
		if(e.getItem() != null && e.getItem().getType().equals(Material.FLINT_AND_STEEL))
		{
			e.setUseItemInHand(Result.DENY);
			Player p = e.getPlayer();
			p.openInventory(Main.EnchantmentsMainMenu.GUI(p));
		}
	}
	
	
}
