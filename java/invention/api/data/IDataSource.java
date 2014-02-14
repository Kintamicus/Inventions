package invention.api.data;

import net.minecraft.nbt.NBTTagCompound;

public interface IDataSource {
	
	public void writeToNBT(NBTTagCompound data);
	public void readFromNBT(NBTTagCompound data);
	
}
