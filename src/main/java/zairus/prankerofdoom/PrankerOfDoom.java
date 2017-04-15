package zairus.prankerofdoom;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import zairus.prankerofdoom.proxy.CommonProxy;

@Mod(modid = PODConstants.MODID, name = PODConstants.MODNAME, version = PODConstants.VERSION)
public class PrankerOfDoom
{
	@Mod.Instance(PODConstants.MODID)
	public static PrankerOfDoom instance;
	
	@SidedProxy(clientSide = PODConstants.CLIENT_PROXY, serverSide = PODConstants.COMMON_PROXY)
	public static CommonProxy proxy;
	
	//Packet Pipeline
	
	public static Logger logger;
	
	//Creative tabs
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		
		PODConfig.init(event.getSuggestedConfigurationFile());
		
		PrankerOfDoom.proxy.preInit(event);
		
		//Sounds register
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		PrankerOfDoom.proxy.init(event);
		//Packer pipeline initialize
		
		//Register items
		//Register blocks
		
		PrankerOfDoom.proxy.initBuiltinShapes();
		
		//Creafting recipes
		
		//Events
		
		//Achievements and or stats
		
		//Gui handlers
    }
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		PrankerOfDoom.proxy.postInit(event);
	}
	
	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		//Register commands
	}
}
