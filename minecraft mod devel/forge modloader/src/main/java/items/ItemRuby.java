package items;

import com.boby_best.FirstMod.FirstMod;
import com.boby_best.FirstMod.Reference;

import net.minecraft.item.Item;

public class ItemRuby extends Item{

	public ItemRuby() {
		setUnlocalizedName(Reference.FirstModItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.RUBY.getRegistryName());
		setCreativeTab(FirstMod.tabFirstMod);
	}

}
