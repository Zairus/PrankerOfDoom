package zairus.prankerofdoom;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class PODConfig
{
	public static Configuration configuration;
	
	public static void init(File cFile)
	{
		configuration = new Configuration(cFile);
		
		configuration.load();
		
		configuration.save();
	}
}
