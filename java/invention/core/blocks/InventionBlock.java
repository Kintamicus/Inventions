package invention.core.blocks;

import invention.core.InventionTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InventionBlock extends Block {

	protected InventionBlock(Material material) {
		super(material);
		this.setCreativeTab(InventionTabs.inventionBlocks);
	}
	
	
}
