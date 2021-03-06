package org.CDnoMlqko.ChatUtils.events;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.scoreboard.SidebarManager;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{
	
	Main plugin;
	
	public JoinListener(Main plugin)
	{
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		
		if(!p.hasPlayedBefore())
		{
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", p.getName())));
		}
		else
		{
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", p.getName())));
		}
		
//		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
//		ItemMeta meta = item.getItemMeta();
//		ArrayList<String> lore = new ArrayList<String>();
//		lore.add(ChatColor.GRAY + Main.enchantmentsManager.levitationEnchantment.getName() + " I");
//		meta.setLore(lore);
//		item.setItemMeta(meta);
//		item.addEnchantment(Main.enchantmentsManager.levitationEnchantment, 1);
//		p.getInventory().addItem(item);
		
		
		ScoreboardDataManager.initialisePlayerScoreboardIfNeeded(p);
		SidebarManager.refreshSidebarInfo(p);
	}
	
}
