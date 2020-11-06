package main.java.com.dmnerd.resourcefullchickens.init.items;

import main.java.com.dmnerd.resourcefullchickens.ResourcefullChickens;
import net.minecraft.item.Item;

public class ChickenItem extends Item{

    public ChickenItem(Properties properties) {
        super(properties);
        properties.maxStackSize(16);
    }
}
