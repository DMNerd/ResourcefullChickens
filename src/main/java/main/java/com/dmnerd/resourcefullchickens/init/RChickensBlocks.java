package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.TileEntityEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.blocks.RoostBoxBlock;
import main.java.com.dmnerd.resourcefullchickens.init.tileentity.RoostBoxTileEntity;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RChickensBlocks {

    public static final BlockEntry<RoostBoxBlock> ROOST_BOX = ResourcefullChickens.registrate()
            .block("roost_box", RoostBoxBlock::new)
            .lang("Roost Box")
            .properties(properties -> properties.sound(SoundType.WOOD))
            .blockstate((context, provider) -> {
            })
            .item()
            .model((context, provider) -> {
            })
            .build()
            .tileEntity(RoostBoxTileEntity::new)
            .build()
            .register();
    public static final TileEntityEntry<RoostBoxTileEntity> ROOST_BOX_TILE_ENTITY = ResourcefullChickens.registrate()
            .tileEntity(RoostBoxTileEntity::new)
            .validBlock(RChickensBlocks.ROOST_BOX)
            .register();


    public static void init() {}
}
