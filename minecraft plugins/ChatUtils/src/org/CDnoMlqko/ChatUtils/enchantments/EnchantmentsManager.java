package org.CDnoMlqko.ChatUtils.enchantments;

import java.lang.reflect.Field;

import org.CDnoMlqko.ChatUtils.Main;
import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;

public class EnchantmentsManager implements Listener{

	public LevitationEnchantment levitationEnchantment;
	public LightningEnchantment lightningEnchantment;
	
	Main plugin;
	
	public EnchantmentsManager(Main plugin) {
		this.plugin = plugin;
		levitationEnchantment = new LevitationEnchantment(101,plugin);
		lightningEnchantment = new LightningEnchantment(102, plugin);
		registerEnchantment(levitationEnchantment);
		registerEnchantment(lightningEnchantment);
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	public void registerEnchantment(Enchantment ench) {
		try {
			try {
				Field f = Enchantment.class.getDeclaredField("acceptingNew");
				f.setAccessible(true);
				f.set(null, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Enchantment.registerEnchantment(ench);
			} catch (IllegalArgumentException e) {
				// if this is thrown it means the id is already taken.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void prepareForReload() {
		levitationEnchantment.prepareForReload();
		lightningEnchantment.prepareForReload();
	}
	
	public void addRandomCustomEnchatment()
	{
		
	}
}
