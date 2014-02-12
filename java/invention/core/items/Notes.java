package invention.core.items;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Notes extends InventionItem {
	
	public Notes() {
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
		if(!item.hasTagCompound()) item.setTagCompound(new NBTTagCompound());
		
		// TODO Show GUI here
        return item;
    }

	public String getDiscription(ItemStack item) {
		return getData(item).getString("discription");
	}

	public void setDiscription(String discription, ItemStack item) {
		getData(item).setString("discription", discription);
	}

	public String getTitle(ItemStack item) {
		return getData(item).getString("title");
	}

	public void setTitle(String name, ItemStack item) {
		getData(item).setString("title", name);
	}

	public String getTimeStamp(ItemStack item) {
		return getData(item).getString("TimeStamp");
	}

	public void setTimeStamp(String time, ItemStack item) {
		if (time.isEmpty()) {
			time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		}
		getData(item).setString("TimeStamp", time);
	}
	
	private NBTTagCompound getData(ItemStack item) {
		if (!item.hasTagCompound()) item.setTagCompound(new NBTTagCompound());
		
		return item.getTagCompound();
	}
}
