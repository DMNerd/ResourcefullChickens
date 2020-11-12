package main.java.com.dmnerd.resourcefullchickens;

import com.tterrag.registrate.providers.ProviderType;
import main.java.com.dmnerd.resourcefullchickens.content.creativetab.ChickenItemGroup;
import main.java.com.dmnerd.resourcefullchickens.content.integration.DependencyCheck;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSCommonChickensItems;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMekanismChickensItems;
import main.java.com.dmnerd.resourcefullchickens.content.integration.items.RSMysticalChickensItems;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensBlocks;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.NonNullLazy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.com.dmnerd.resourcefullchickens.frequent.References;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.NonNullLazyValue;
import net.minecraftforge.fml.common.Mod;


@Mod(References.MODID)
public class ResourcefullChickens {

    public static final NonNullLazy<ItemGroup> chickenTab = NonNullLazy.of(ChickenItemGroup::new);

    public static ResourcefullChickens instance;

    public static Logger LOGGER = LogManager.getLogger();

    private static final NonNullLazyValue<Registrate> REGISTRATE = new NonNullLazyValue<>(() ->
            Registrate.create(References.MODID));

    public ResourcefullChickens(){
        RChickensItems.init();
        //RChickensBlocks.init();

        //Common Chickens
        RSCommonChickensItems.init();
        //Mekanism specific Chickens
        if (DependencyCheck.isMekanismLoaded()) RSMysticalChickensItems.init();
        //Mystical Agriculture specific Chickens
        if (DependencyCheck.isMysticalAgricultureLoaded()) RSMekanismChickensItems.init();
    }

    public static Registrate registrate()
    {
        return REGISTRATE.get();
    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(References.MODID, path);
    }



}
