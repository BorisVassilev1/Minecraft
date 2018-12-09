package org.CDnoMlqko.ChatUtils.enchantments;

import org.bukkit.enchantments.Enchantment;

public enum CustomEnchantmentRarity {
	
	COMMON(
			new int[]   {101, 102},
			new float[] {0.5f, 0.5f}),
	EPIC(
			new int[]   {101,102},
			new float[] {0.5f, 0.5f}),
	LEGENDARY(
			new int[]   {101, 102},
			new float[] {0.5f, 0.5f});
	
	Enchantment[] enchantmentsPoll;
	float[] rarities;
	
	private CustomEnchantmentRarity(int[] ids, float[] rarities) {
		this.enchantmentsPoll = new Enchantment[ids.length];
		for(int i = 0; i < ids.length; i ++)
		{
			enchantmentsPoll[i] = Enchantment.getById(ids[i]);
		}
	}

}
