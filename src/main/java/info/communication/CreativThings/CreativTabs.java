package info.communication.CreativThings;

import info.communication.Items.ItemsMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativTabs {

        public static final CreativeTabs tabCommunication = new CreativeTabs("Communication") {
            @Override
            public Item getTabIconItem() {
                return ItemsMain.monkeyGoldIngot;
            }
        };
}
