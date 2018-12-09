package com.boby_best.FirstMod.blocks;

import com.boby_best.FirstMod.FirstMod;
import com.boby_best.FirstMod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block{
	public BlockRuby()
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.FirstModBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.FirstModBlocks.RUBYBLOCK.getRegistryName());
		setHardness(6.0f);
		setResistance(10.0f);
		setCreativeTab(FirstMod.tabFirstMod);
	}

}
