package org.CDnoMlqko.ChatUtils.ui.customEnchantments;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.scoreboard.ScoreboardDataManager;
import org.CDnoMlqko.ChatUtils.ui.InventoryGUI;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EnchantmentsMainMenu extends InventoryGUI{
	
	public EnchantmentsMainMenu() {
		super("&dSuper Enchanting Table", 6);
	}
	
	public Inventory GUI(Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_cells, inventory_name);
		
		Utils.createItem(inv, Material.COBBLESTONE, 1, slot(4,5), "Exit", "");
		
		Utils.createItem(inv, Material.ENCHANTMENT_TABLE, 1, slot(1,2), "&fCOMMON ENCHANTMENT", "&eCosts: &f" + 25 + " &dMagic Dust", 
				ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 25 ? "&aCan Purchase": "&cYou can't afford that!");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 0, slot(1,1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 0, slot(1,3), " ", "");
		
		Utils.createItem(inv, Material.ENCHANTMENT_TABLE, 1, slot(3,2), "&9EPIC ENCHANTMENT", "&eCosts: &f" + 50 + " &dMagic Dust",
				ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 50 ? "&aCan Purchase": "&cYou can't afford that!");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(3,1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(3,3), " ", "");
		
		Utils.createItem(inv, Material.ENCHANTMENT_TABLE, 1, slot(5,2), "&6LEGENDARY ENCHANTMENT", "&eCosts: &f" + 100 + " &dMagic Dust",
				ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 100 ? "&aCan Purchase": "&cYou can't afford that!");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 1, slot(5,1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 1, slot(5,3), " ", "");
		
		toReturn.setContents(inv.getContents());
		return toReturn;
		
	}
	
	public void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(slot == slot(4,5))//Exit
		{
			p.closeInventory();
			return;
		}
		if(slot == slot(1,2))//Common enchantment
		{
			if(ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 25)
			{
				p.openInventory(Main.commonEnchantmentMenu.GUI(p));
			}
			return;
		}
		if(slot == slot(3,2))//epic enchantment
		{
			if(ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 50)
			{
				p.openInventory(Main.epicEnchantmentMenu.GUI(p));
			}
			return;
		}
		if(slot == slot(5,2))//legendary enchantment
		{
			if(ScoreboardDataManager.scoreboardData.get(p.getName()).getMagicDust() >= 100)
			{
				p.openInventory(Main.legendaryEnchantmentMenu.GUI(p));
			}
			return;
		}
		
	}

	@Override
	public boolean canTheItemBeTaken(int slot) {
		return false;
	}
	
}
