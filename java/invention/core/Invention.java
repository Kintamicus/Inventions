package invention.core;

import invention.core.items.LogBook;
import invention.core.items.Camera;
import invention.core.items.WritingUtensil;
import net.minecraft.item.Item;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Invention.MODID, version = Invention.VERSION, useMetadata=true)
public class Invention {
	
	 	public static final String MODID = "invention";
	    public static final String VERSION = "0.1";
	    
	    /* Items */
	    public static Item logbook,
	    				   pencil,
	    				   pen,
	    				   stopwatch;
	    				   
	    
	    @SidedProxy(clientSide = "invention.core.client.ClientProxy", serverSide = "invention.core.CommonProxy")
		public static CommonProxy proxy;
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	    	FMLCommonHandler.instance().bus().register(new EventManager()); 
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	registerItems();
			// some example code
	    }
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
			// some example code
	    }
	    
	    public void registerItems() {
	    	logbook = new LogBook();
	    	stopwatch = new Camera();
	    	pencil = new WritingUtensil("Pencil", 30);
	    	pen = new WritingUtensil("Pen", 30);
	    }
}
