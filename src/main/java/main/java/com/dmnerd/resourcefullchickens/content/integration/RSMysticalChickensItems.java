package main.java.com.dmnerd.resourcefullchickens.content.integration;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RSMysticalChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate();

    public static final ItemEntry<ChickenItem> CHICKEN_INFFERIUM = REGISTRATE
            .item("chicken_inferium", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Inferium Chicken")
            .register();

    public static void register(){}
}
