package org.CDnoMlqko.ChatUtils.events;

import org.CDnoMlqko.ChatUtils.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener{
	
	Main plugin;
	
	public InventoryClickListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		String title = e.getInventory().getTitle();
		
		if(title.equals(Main.EnchantmentsMainMenu.inventory_name))
		{
			boolean isInOwnInventory = (e.getRawSlot() >= Main.EnchantmentsMainMenu.inv_cells);
			if(!isInOwnInventory) 
			{
				if(!Main.EnchantmentsMainMenu.canTheItemBeTaken(e.getSlot()))
				{
					e.setCancelled(true);
				}
				if(e.getCurrentItem() != null)
				{
					Main.EnchantmentsMainMenu.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				}
			}
		}
		if(title.equals(Main.commonEnchantmentMenu.inventory_name))
		{
			boolean isInOwnInventory = (e.getRawSlot() >= Main.commonEnchantmentMenu.inv_cells);
			if(!isInOwnInventory) 
			{
				if(!Main.commonEnchantmentMenu.canTheItemBeTaken(e.getSlot()))
				{
					e.setCancelled(true);
				}
				if(e.getCurrentItem() != null)
				{
					Main.commonEnchantmentMenu.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				}
			}
		}
		if(title.equals(Main.epicEnchantmentMenu.inventory_name))
		{
			boolean isInOwnInventory = (e.getRawSlot() >= Main.epicEnchantmentMenu.inv_cells);
			if(!isInOwnInventory) 
			{
				if(!Main.epicEnchantmentMenu.canTheItemBeTaken(e.getSlot()))
				{
					e.setCancelled(true);
				}
				if(e.getCurrentItem() != null)
				{
					Main.epicEnchantmentMenu.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				}
			}
		}
		if(title.equals(Main.legendaryEnchantmentMenu.inventory_name))
		{
			boolean isInOwnInventory = (e.getRawSlot() >= Main.legendaryEnchantmentMenu.inv_cells);
			if(!isInOwnInventory) 
			{
				if(!Main.legendaryEnchantmentMenu.canTheItemBeTaken(e.getSlot()))
				{
					e.setCancelled(true);
				}
				if(e.getCurrentItem() != null)
				{
					Main.legendaryEnchantmentMenu.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
				}
			}
		}
	}

}
