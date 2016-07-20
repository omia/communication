package info.communication.main;

import info.communication.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version)
public class Communication {
    @SidedProxy(clientSide = Reference.CLIENTPROXY,serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static Communication instance;

    public static Logger logger;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
