package invention.api.notes;

import java.awt.Color;

import net.minecraft.util.IIcon;

public interface ILogBookTab {
	/*
	 * Data used to populate a logbook. Most common use is when discovering techniques and immediately writing it down
	 */
	
	public IIcon getIcon();
	public Color getTabColor();
	

}
