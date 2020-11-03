package main.java.com.dmnerd.resourcefullchickens.content.creativetab;

import main.java.com.dmnerd.resourcefullchickens.frequent.Resources;
import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


import javax.annotation.Nonnull;

public class ChickenItemGroup extends ItemGroup {

    public ChickenItemGroup() {
        super(Resources.MODID);
        setNoTitle();
        setBackgroundImageName("rchickens.png");
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return RChickensItems.CHICKEN_BASE.asStack();
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
