package main.java.com.dmnerd.resourcefullchickens.init.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

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

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("Hello world"));
    }
}
