package main.java.com.dmnerd.resourcefullchickens.content.integration.items;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.frequent.ChickenTypes;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RSMysticalChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate();

    public static ItemEntry<ChickenItem> CHICKEN_INFERIUM = REGISTRATE
            .item(ChickenTypes.INFERIUM, ChickenItem::new)
            .lang("Inferium Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_PRUDENTIUM = REGISTRATE
            .item(ChickenTypes.PRUDENTIUM, ChickenItem::new)
            .lang("Prudentium Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_TERTIUM = REGISTRATE
            .item(ChickenTypes.TERTIUM, ChickenItem::new)
            .lang("Tertium Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_IMPERIUM = REGISTRATE
            .item(ChickenTypes.IMPERIUM, ChickenItem::new)
            .lang("Imperium Chicken")
            .register();
    public static ItemEntry<ChickenItem> CHICKEN_SUPERMIUM = REGISTRATE
            .item(ChickenTypes.SUPREMIUM, ChickenItem::new)
            .lang("Supremium Chicken")
            .register();


    public static void register(){}
}
