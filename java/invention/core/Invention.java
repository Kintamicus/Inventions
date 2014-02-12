package invention.core;

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
	    
	    @SidedProxy(clientSide = "invention.core.client.ClientProxy", serverSide = "invention.core.CommonProxy")
		public static CommonProxy proxy;
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	    	
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
			// some example code
	    }
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
			// some example code
	    }
}
