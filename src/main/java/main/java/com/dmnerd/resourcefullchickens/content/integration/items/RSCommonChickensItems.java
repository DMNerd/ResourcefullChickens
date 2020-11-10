package main.java.com.dmnerd.resourcefullchickens.content.integration.items;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.content.integration.DependencyCheck;
import main.java.com.dmnerd.resourcefullchickens.frequent.ChickenTypes;
import main.java.com.dmnerd.resourcefullchickens.frequent.References;
import main.java.com.dmnerd.resourcefullchickens.init.items.ChickenItem;

public class RSCommonChickensItems {

    private static final Registrate REGISTRATE = ResourcefullChickens.registrate().itemGroup(ResourcefullChickens.chickenTab::get, References.MODNAME);

    public static ItemEntry<ChickenItem> CHICKEN_COPPER;
    public static ItemEntry<ChickenItem> CHICKEN_STEEL;
    public static ItemEntry<ChickenItem> CHICKEN_URANIUM;

    public static void register(){

        if (DependencyCheck.isMekanismLoaded() || DependencyCheck.isImmersiveEngineeringLoaded())
             CHICKEN_COPPER = REGISTRATE
                    .item(ChickenTypes.COPPER, ChickenItem::new)
                    .lang("Copper Chicken")
                    .register();
        if (DependencyCheck.isMekanismLoaded() || DependencyCheck.isImmersiveEngineeringLoaded())
            CHICKEN_STEEL = REGISTRATE
                    .item(ChickenTypes.STEEL, ChickenItem::new)
                    .lang("Copper Chicken")
                    .register();
        if (DependencyCheck.isMekanismLoaded() || DependencyCheck.isImmersiveEngineeringLoaded())
            CHICKEN_URANIUM = REGISTRATE
                    .item(ChickenTypes.URANIUM, ChickenItem::new)
                    .lang("Uranium Chicken")
                    .register();
    }
}
