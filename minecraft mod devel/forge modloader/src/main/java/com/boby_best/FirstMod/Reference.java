package com.boby_best.FirstMod;

import scala.reflect.internal.Trees.This;

public class Reference {

	public static final String MOD_ID = "fm";
	public static final String NAME = "First Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";

	public static final String COMMON_PROXY_CLASS = "com.boby_best.FirstMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.boby_best.FirstMod.proxy.ServerProxy";

	public static enum FirstModItems {
		OBSIDIANINGOT("obsidianingot" , "ItemObsidianingot"),
		RUBY("ruby" , "ItemRuby"),
		TOMATO("tomato","ItemTomato");
		
		private String unlocalizedName;
		private String registryName;

		FirstModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	public static enum FirstModBlocks {
		RUBYBLOCK("rubyblock" , "BlockRuby");
		
		private String unlocalizedName;
		private String registryName;

		FirstModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
}
