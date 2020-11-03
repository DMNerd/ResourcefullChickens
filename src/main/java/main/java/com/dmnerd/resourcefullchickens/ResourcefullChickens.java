package main.java.com.dmnerd.resourcefullchickens;

import main.java.com.dmnerd.resourcefullchickens.init.RChickensBlocks;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.java.com.dmnerd.resourcefullchickens.frequent.Resources;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.NonNullLazyValue;
import net.minecraftforge.fml.common.Mod;


@Mod(Resources.MODID)
public class ResourcefullChickens {

    public static Logger logger = LogManager.getLogger();

    private static final NonNullLazyValue<Registrate> REGISTRATE = new NonNullLazyValue<>(() -> Registrate.create(Resources.MODID));

    public ResourcefullChickens(){
        RChickensItems.register();
        RChickensBlocks.register();
    }

    public static ResourcefullChickens instance;

    public static Registrate registrate()
    {
        return REGISTRATE.get();
    }


}
