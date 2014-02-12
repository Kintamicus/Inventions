package invention.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CustomCreativeTab extends CreativeTabs{

	public CustomCreativeTab(String label) {
		super(label);
		// TODO Customizer Creative Tab - Let's wait until we have something to customize
	}
	
	public Item getTabIconItem() {
		 return Item.getItemFromBlock(Blocks.brick_block);
	}
}
