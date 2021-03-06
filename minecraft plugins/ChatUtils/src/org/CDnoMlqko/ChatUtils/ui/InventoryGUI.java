package org.CDnoMlqko.ChatUtils.ui;

import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class InventoryGUI {
	public Inventory inv;
	public String inventory_name;
	public int inv_cells = 5 * 9;
	
	public InventoryGUI(String name, int rows)
	{
		inventory_name = Utils.chat(name);
		inv_cells = rows * 9;
		inv = Bukkit.createInventory(null, inv_cells);
	}
	
	public abstract Inventory GUI(Player p);
	
	public abstract void clicked(Player p, int slot, ItemStack clicked, Inventory inv);
	
	public abstract boolean canTheItemBeTaken(int slot);
	
	protected int slot(int x,int y)
	{
		return y * 9 + x;
	}
}
