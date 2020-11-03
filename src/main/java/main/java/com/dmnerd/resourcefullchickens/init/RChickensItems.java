package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate().itemGroup(() -> ResourcefullChickens.chickenTab);

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = REGISTRATE
            .object("chicken_base")
            .item(ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IRON = REGISTRATE
            .object("chicken_iron")
            .item(ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Iron Chicken")
            .register();


    public static void register() {}

}
