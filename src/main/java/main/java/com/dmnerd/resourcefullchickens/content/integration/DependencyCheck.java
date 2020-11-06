package main.java.com.dmnerd.resourcefullchickens.content.integration;

import net.minecraftforge.fml.ModList;

public class DependencyCheck
{

    public static final String dep_meka_id = "mekanism";

    public static final String dep_agri_id = "mysticalagriculture";

    public static final String dep_imer_id = "immersiveengineering";

    public static boolean isMekanismLoaded(){
        return ModList.get().isLoaded(dep_meka_id);
    }

    public static boolean isMysticalAgricultureLoaded(){
        return ModList.get().isLoaded(dep_agri_id);
    }

    public static boolean isImmersiveEngineeringLoaded(){
        return ModList.get().isLoaded(dep_imer_id);
    }
}
