package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.blocks.RoostBoxBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RChickensBlocks {

    public static final BlockEntry<RoostBoxBlock> ROOST_BOX = ResourcefullChickens.registrate()
            .block("roost_box", RoostBoxBlock::new)
            .lang("Roost Box")
            .properties(properties -> properties.sound(SoundType.WOOD))
            .simpleItem()
            .register();


    public static void register() {}
}
