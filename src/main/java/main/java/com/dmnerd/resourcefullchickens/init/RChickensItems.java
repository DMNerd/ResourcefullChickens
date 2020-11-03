package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate();

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = REGISTRATE
            .item("chicken_base", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IRON = REGISTRATE
            .item("chicken_iron", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Iron Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_GOLD = REGISTRATE
            .item("chicken_gold", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Gold Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_LAPIS = REGISTRATE
            .item("chicken_lapis", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Lapis Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_REDSTONE = REGISTRATE
            .item("chicken_redstone", ChickenItem::new)
            .properties(properties -> properties.maxStackSize(16))
            .lang("Redstone Chicken")
            .register();



    public static void register() {}

}
