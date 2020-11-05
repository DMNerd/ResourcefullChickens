package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate();

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = REGISTRATE
            .item("chicken_base", ChickenItem::new)
            .lang("Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IRON = REGISTRATE
            .item("chicken_iron", ChickenItem::new)
            .lang("Iron Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_GOLD = REGISTRATE
            .item("chicken_gold", ChickenItem::new)
            .lang("Gold Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_DIAMOND = REGISTRATE
            .item("chicken_diamond", ChickenItem::new)
            .lang("Diamond Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_EMERALD = REGISTRATE
            .item("chicken_emerald", ChickenItem::new)
            .lang("Emerald Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_LAPIS = REGISTRATE
            .item("chicken_lapis", ChickenItem::new)
            .lang("Lapis Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_REDSTONE = REGISTRATE
            .item("chicken_redstone", ChickenItem::new)
            .lang("Redstone Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_BLAZE = REGISTRATE
            .item("chicken_blaze", ChickenItem::new)
            .lang("Redstone Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_QUARTZ = REGISTRATE
            .item("chicken_quartz", ChickenItem::new)
            .lang("Quartz Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_COAL = REGISTRATE
            .item("chicken_coal", ChickenItem::new)
            .lang("Coal Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_HONEY = REGISTRATE
            .item("chicken_honey", ChickenItem::new)
            .lang("Honey Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();


    public static void register() {}

}
