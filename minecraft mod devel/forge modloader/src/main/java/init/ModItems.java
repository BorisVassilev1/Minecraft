package init;

import com.boby_best.FirstMod.Reference;

import items.ItemObsidianingot;
import items.ItemRuby;
import items.ItemTomato;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item obsidianingot;
	public static Item ruby;
	public static Item tomato;
	
	public static void init()
	{
		obsidianingot = new ItemObsidianingot();
		ruby = new ItemRuby();
		tomato = new ItemTomato();
	}
	
	public static void register()
	{
		ForgeRegistries.ITEMS.register(obsidianingot);
		ForgeRegistries.ITEMS.register(ruby);
		ForgeRegistries.ITEMS.register(tomato);
	}
	
	public static void registerRenders()
	{
		registerRender(obsidianingot);
		registerRender(ruby);
		registerRender(tomato);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
