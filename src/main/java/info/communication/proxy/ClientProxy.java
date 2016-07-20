package info.communication.proxy;


import info.communication.Items.ItemsMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{


    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        ItemsMain.init();
    }


    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
        ItemsMain.registerRenders();
    }


    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }


}
