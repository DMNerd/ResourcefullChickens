package main.java.com.dmnerd.resourcefullchickens.events;

import main.java.com.dmnerd.resourcefullchickens.init.RChickensItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class RCClientEventHandler {

    @SubscribeEvent
    public static void onEntityIteract(PlayerInteractEvent.EntityInteract event){
        Entity target = event.getTarget();
        PlayerEntity player = event.getPlayer();

        if(!target.getEntityWorld().isRemote && player.getHeldItemMainhand().isEmpty() && player.isSneaking()){
            if(target instanceof ChickenEntity){
                player.addItemStackToInventory(RChickensItems.CHICKEN_BASE.asStack());
                target.remove();
            }
        }
    }
}
