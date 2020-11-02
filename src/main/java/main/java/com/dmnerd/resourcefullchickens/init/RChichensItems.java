package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChichensItems {

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = ResourcefullChickens.registrate()
            .object("chicken_base")
            .item(ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Chicken")
            .register();

}
