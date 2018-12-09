package items;

import com.boby_best.FirstMod.FirstMod;
import com.boby_best.FirstMod.Reference;
import com.boby_best.FirstMod.Reference.FirstModItems;

import net.minecraft.item.ItemFood;

public class ItemTomato extends ItemFood{

	public ItemTomato() {
		super(4, 0.8f, true);
		setUnlocalizedName(Reference.FirstModItems.TOMATO.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.TOMATO.getRegistryName());
		setCreativeTab(FirstMod.tabFirstMod);
	}
	

}
