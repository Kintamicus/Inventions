package invention.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InventionTabs {
	
    @SideOnly(Side.CLIENT)
    public static final CreativeTabs inventionBlocks = new CreativeTabs("invention_blocks")
    {
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.brick_block);
        }
    };
    
    @SideOnly(Side.CLIENT)
    public static final CreativeTabs inventionItems = new CreativeTabs("invention_items")
    {
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.brick_block);
        }
    };
    
    @SideOnly(Side.CLIENT)
    public static final CreativeTabs inventionCustomizer = new CustomCreativeTab("invention_customizer");
}
