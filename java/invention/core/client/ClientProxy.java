package invention.core.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import invention.core.CommonProxy;

public class ClientProxy extends CommonProxy{

	@Override
	public void init() {
		
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}
