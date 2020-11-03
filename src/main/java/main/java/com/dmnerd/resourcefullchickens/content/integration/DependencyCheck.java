package main.java.com.dmnerd.resourcefullchickens.content.integration;

import net.minecraftforge.fml.ModList;

public class DependencyCheck
{
    public static boolean isMekanismLoaded(){
        return ModList.get().isLoaded("mekanism");
    }

    public static boolean isMysticalAgricultureLoaded(){
        return ModList.get().isLoaded("mysticalagriculture");
    }
}
