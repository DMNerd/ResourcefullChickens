package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.frequent.ChickenTypes;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate();

    public static final ItemEntry<ChickenItem> CHICKEN_BASE = REGISTRATE
            .item(ChickenTypes.BASIC, ChickenItem::new)
            .lang("Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IRON = REGISTRATE
            .item(ChickenTypes.IRON, ChickenItem::new)
            .lang("Iron Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_GOLD = REGISTRATE
            .item(ChickenTypes.GOLD, ChickenItem::new)
            .lang("Gold Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_DIAMOND = REGISTRATE
            .item(ChickenTypes.DIAMOND, ChickenItem::new)
            .lang("Diamond Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_EMERALD = REGISTRATE
            .item(ChickenTypes.EMERALD, ChickenItem::new)
            .lang("Emerald Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_LAPIS = REGISTRATE
            .item(ChickenTypes.LAPIS, ChickenItem::new)
            .lang("Lapis Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_REDSTONE = REGISTRATE
            .item(ChickenTypes.REDSTONE, ChickenItem::new)
            .lang("Redstone Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_BLAZE = REGISTRATE
            .item(ChickenTypes.BLAZE, ChickenItem::new)
            .lang("Redstone Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_QUARTZ = REGISTRATE
            .item(ChickenTypes.QUARTZ, ChickenItem::new)
            .lang("Quartz Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_COAL = REGISTRATE
            .item(ChickenTypes.COAL, ChickenItem::new)
            .lang("Coal Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_HONEY = REGISTRATE
            .item(ChickenTypes.HONEY, ChickenItem::new)
            .lang("Honey Chicken")
            .properties(properties -> properties.maxStackSize(16))
            .register();


    public static void register() {}

}
