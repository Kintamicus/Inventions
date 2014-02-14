package invention.core;

import invention.api.items.IWritingUtensil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventManager {
	
	@SubscribeEvent
	public void useItem(PlayerUseItemEvent.Start event) {
		if (event.item.getItem().equals(Items.paper) && useWritingUtensil(event.entityPlayer)) {
			//event.item.set
		}
	}
	
	public boolean useWritingUtensil(EntityPlayer player) {
		for (int i = 0; i < player.inventory.mainInventory.length; ++i)
        {
            if (player.inventory.mainInventory[i] != null &&  player.inventory.mainInventory[i].getItem() instanceof IWritingUtensil )
            {
            	player.inventory.mainInventory[i].damageItem(1, player);
                return true;
            }
        }
		
		return false;
	}
}
