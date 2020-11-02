package main.java.com.dmnerd.resourcefullchickens;

import main.java.com.dmnerd.resourcefullchickens.frequent.Resources;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.NonNullLazyValue;
import net.minecraftforge.fml.common.Mod;

@Mod(Resources.MODID)
public class ResourcefullChickens {

    private static final NonNullLazyValue<Registrate> REGISTRATE = new NonNullLazyValue<>(() -> Registrate.create(Resources.MODID));

    public ResourcefullChickens(){

    }

    public static ResourcefullChickens instance;

    public static Registrate registrate()
    {
        return REGISTRATE.get();
    }

}
