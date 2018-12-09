package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void register()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("fm_rubyblock"), new ResourceLocation("fm_blocks"), new ItemStack(ModBlocks.rubyblock), 
				new Object[] {"XXX","XXX","XXX", 'X', ModItems.ruby});
		
		GameRegistry.addSmelting(ModItems.obsidianingot, new ItemStack(ModItems.ruby), 10);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidianingot,2), 10);
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("fm_rubyblock"), new ResourceLocation("fm_blocks"), new ItemStack(ModItems.tomato), 
				new Ingredient[] {Ingredient.fromItem(Items.REDSTONE),Ingredient.fromItem(Items.APPLE)});
	}
}
