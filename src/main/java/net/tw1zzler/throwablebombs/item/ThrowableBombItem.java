package net.tw1zzler.throwablebombs.item;

import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.tw1zzler.throwablebombs.entity.ThrowableBombProjectile;

/**
 * Subclass of item for use logic of bombs
 * @author tw1zzler
 */
public class ThrowableBombItem extends Item {
    public ThrowableBombItem(Properties properties) {
        super(properties);
    }

    /**
     * Override method for bomb to be thrown when used...
     */
//    @Override
//    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
//        ItemStack itemstack = player.getItemInHand(hand);
//        if (!world.isClientSide) {
//            ThrowableBombProjectile thrownBomb = new ThrowableBombProjectile(ThrowableBombProjectile.get(), world);
//        }
//        return super.use(world, player, hand);
//    }
}
