package main.java.com.dmnerd.resourcefullchickens.init;

import com.tterrag.registrate.util.entry.TileEntityEntry;
import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import main.java.com.dmnerd.resourcefullchickens.init.tileentity.RoostBoxTileEntity;

public class RChickensTileEntities {

    public static final TileEntityEntry<RoostBoxTileEntity> ROOST_BOX = ResourcefullChickens.registrate()
            .tileEntity("roost_box", RoostBoxTileEntity::new)
            .validBlock(RChickensBlocks.ROOST_BOX)
            .register();


    public static void register(){}
}
