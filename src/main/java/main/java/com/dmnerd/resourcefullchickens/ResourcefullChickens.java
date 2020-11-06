package main.java.com.dmnerd.resourcefullchickens;

import main.java.com.dmnerd.resourcefullchickens.content.creativetab.ChickenItemGroup;
import main.java.com.dmnerd.resourcefullchickens.content.integration.DependencyCheck;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMekanismChickensItems;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMysticalChickensItems;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensBlocks;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensTileEntities;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.com.dmnerd.resourcefullchickens.frequent.References;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.NonNullLazyValue;
import net.minecraftforge.fml.common.Mod;


@Mod(References.MODID)
public class ResourcefullChickens {

    public static ItemGroup chickenTab = new ChickenItemGroup();

    public static Logger LOGGER = LogManager.getLogger();

    private static final NonNullLazyValue<Registrate> REGISTRATE = new NonNullLazyValue<>(() -> Registrate.create(References.MODID).itemGroup(() -> ResourcefullChickens.chickenTab));

    public ResourcefullChickens(){
        RChickensItems.register();
        RChickensBlocks.register();
        RChickensTileEntities.register();

        //Common Chickens

        //Mekanism specific Chickens
        if (DependencyCheck.isMekanismLoaded()) RSMysticalChickensItems.register();
        //Mystical Agriculture specific Chickens
        if (DependencyCheck.isMysticalAgricultureLoaded()) RSMekanismChickensItems.register();
    }

    public static ResourcefullChickens instance;

    public static Registrate registrate()
    {
        return REGISTRATE.get();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(References.MODID, path);
    }


}
