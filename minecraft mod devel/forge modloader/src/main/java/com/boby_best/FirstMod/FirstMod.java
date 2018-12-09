package com.boby_best.FirstMod;

import com.boby_best.FirstMod.proxy.CommonProxy;

import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class FirstMod {
	
	@Instance
	public static FirstMod instance;
	
	@SidedProxy(clientSide = Reference.COMMON_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabFirstMod = new CreativeTabs("tab_FirstMod") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.ruby);
		}
	};
	
}
