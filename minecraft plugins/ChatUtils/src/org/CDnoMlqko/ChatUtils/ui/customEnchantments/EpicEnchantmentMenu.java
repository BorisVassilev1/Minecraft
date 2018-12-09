package org.CDnoMlqko.ChatUtils.ui.customEnchantments;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.ui.InventoryGUI;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EpicEnchantmentMenu extends InventoryGUI{

	public EpicEnchantmentMenu() {
		super("&9EPIC ENCHANTMENT", 6);
	}

	@Override
	public Inventory GUI(Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_cells, inventory_name);
		
		Utils.createItemByte(inv, Material.STAINED_CLAY, 1, 14, slot(2,5), "&cCANCEL", "&eNothing will be lost!");
		Utils.createItemByte(inv, Material.STAINED_CLAY, 1, 5, slot(6,5), "&aCONTINUE", "&eWarning: this CANNOT be undone!");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 14, slot(1, 5), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 14, slot(3, 5), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 5, slot(5, 5), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 5, slot(7, 5), " ", "");
		
		
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(0, 1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(0, 2), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(0, 3), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(1, 1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(1, 3), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(2, 1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(2, 2), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 7, slot(2, 3), " ", "");
		
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(6, 1), " " , "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(6, 2), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(6, 3), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(7, 1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(7, 3), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(8, 1), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(8, 2), " ", "");
		Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 11, slot(8, 3), " ", "");
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}

	@Override
	public void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if(slot == slot(2,5))
		{
			p.openInventory(Main.EnchantmentsMainMenu.GUI(p));
		}
	}

	@Override
	public boolean canTheItemBeTaken(int slot) {
		if(slot == slot(1,2) || slot == slot(7,2))
		{
			return true;
		}
		return false;
	}

}
