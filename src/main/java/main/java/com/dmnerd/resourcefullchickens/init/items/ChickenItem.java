package main.java.com.dmnerd.resourcefullchickens.init.items;

import net.minecraft.item.Item;

public class ChickenItem extends Item{

    private static int chickenLVL;

    public ChickenItem(Properties properties) {
        super(properties);
        properties.maxStackSize(16);
        //for now
        chickenLVL = 1;
    }

    public static int getChickenLVL(){
        return chickenLVL;
    }


}
