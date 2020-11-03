package main.java.com.dmnerd.resourcefullchickens;

import main.java.com.dmnerd.resourcefullchickens.content.creativetab.ChickenItemGroup;
import main.java.com.dmnerd.resourcefullchickens.content.integration.DependencyCheck;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMekanismChickensItems;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMysticalChickensItems;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensBlocks;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.com.dmnerd.resourcefullchickens.frequent.Resources;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.NonNullLazyValue;
import net.minecraftforge.fml.common.Mod;


@Mod(Resources.MODID)
public class ResourcefullChickens {

    public static ItemGroup chickenTab = new ChickenItemGroup();

    public static Logger logger = LogManager.getLogger();

    private static final NonNullLazyValue<Registrate> REGISTRATE = new NonNullLazyValue<>(() -> Registrate.create(Resources.MODID).itemGroup(() -> ResourcefullChickens.chickenTab));

    public ResourcefullChickens(){
        RChickensItems.register();
        RChickensBlocks.register();

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
        return new ResourceLocation(Resources.MODID, path);
    }


}
