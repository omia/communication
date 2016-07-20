package info.communication.Items;



import info.communication.CreativThings.CreativTabs;
import info.communication.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsMain {

    public static Item monkeyGoldIngot;
    public static Item monkeyGoldNugget;
    public static Item monkeyFlesh;
    public static Item monkeyFleshCooked;

    public static void init(){
        //items
        monkeyGoldIngot = registerItem(new Item(),"monkeyGoldIngot").setUnlocalizedName("monkeyGoldIngot").setCreativeTab(CreativTabs.tabCommunication);
        monkeyGoldNugget = registerItem(new Item(),"monkeyGoldNugget").setUnlocalizedName("monkeyGoldNugget").setCreativeTab(CreativTabs.tabCommunication);


        //food
        monkeyFlesh = registerItem(new ItemFood(2,1F, true),"monkeyFlesh").setUnlocalizedName("monkeyFlesh").setCreativeTab(CreativTabs.tabCommunication);
        monkeyFleshCooked = registerItem(new ItemFood(4,2F, true),"monkeyFleshCooked").setUnlocalizedName("monkeyFleshCooked").setCreativeTab(CreativTabs.tabCommunication);
    }



    public static void registerRenders(){
        //Items
        registerRender(monkeyGoldIngot);
        registerRender(monkeyGoldNugget);
        //Food
        registerRender(monkeyFlesh);
        registerRender(monkeyFleshCooked);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));}





    //registerItem
    public static Item registerItem(Item item,String name){return registerItem(item,name,null);}
    public static Item registerItem(Item item, String name,CreativeTabs tab){
        GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
        return item;
    }


}
