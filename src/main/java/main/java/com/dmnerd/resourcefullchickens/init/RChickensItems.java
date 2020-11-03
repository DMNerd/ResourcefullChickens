package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChickensItems {

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = ResourcefullChickens.registrate()
            .object("chicken_base")
            .item(ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IRON = ResourcefullChickens.registrate()
            .object("chicken_iron")
            .item(ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Iron Chicken")
            .register();


    public static void register() {}

}
