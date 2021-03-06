package org.CDnoMlqko.ChatUtils.enchantments;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.CDnoMlqko.ChatUtils.Main;
import org.CDnoMlqko.ChatUtils.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LevitationEnchantment extends Enchantment implements Listener{

	int id;
	Main plugin;
	
	public LevitationEnchantment(int id, Main plugin) {
		super(id);
		this.id = id;
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e)
	{
		if(e.getDamager() instanceof Player)
		{
			Player p = (Player) e.getDamager();
			ItemStack item = p.getInventory().getItemInMainHand();
			if(item.getEnchantments().containsKey(this))
			{
				((LivingEntity)e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 5, false, true),true);
			}
			
		}
	}
	
	public void prepareForReload()
	{
		try {
			Field byIdField = Enchantment.class.getDeclaredField("byId");
			Field byNameField = Enchantment.class.getDeclaredField("byName");
			 
			byIdField.setAccessible(true);
			byNameField.setAccessible(true);
			 
			@SuppressWarnings("unchecked")
			HashMap<Integer, Enchantment> byId = (HashMap<Integer, Enchantment>) byIdField.get(null);
			@SuppressWarnings("unchecked")
			HashMap<String, Enchantment> byName = (HashMap<String, Enchantment>) byNameField.get(null);
			 
			if(byId.containsKey(id))
			byId.remove(id);
			 
			if(byName.containsKey(getName()))
			byName.remove(getName());
			} catch (Exception ignored) { }
	}

	@Override
	public boolean canEnchantItem(ItemStack arg0) {
		
		return true;
	}

	@Override
	public boolean conflictsWith(Enchantment arg0) {
		return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		return EnchantmentTarget.ALL;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public String getName() {
		return Utils.chat("&blevitation");
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

	@Override
	public boolean isCursed() {
		return false;
	}

	@Override
	public boolean isTreasure() {
		return false;
	}

}
