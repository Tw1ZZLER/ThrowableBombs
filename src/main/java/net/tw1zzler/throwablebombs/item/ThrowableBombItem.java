package net.tw1zzler.throwablebombs.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.tw1zzler.throwablebombs.entity.ThrowableBombProjectile;

import java.util.function.Supplier;

/**
 * Subclass of item for use logic of bombs
 * @author tw1zzler
 */
public class ThrowableBombItem extends Item {
    private final Supplier<? extends ThrowableBombProjectile> projectileSupplier;

    public ThrowableBombItem(Properties properties, Supplier<? extends ThrowableBombProjectile> projectileSupplier) {
        super(properties);
        this.projectileSupplier = projectileSupplier;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        pLevel.playSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                SoundEvents.TNT_PRIMED, SoundSource.NEUTRAL, 0.5F, 0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));

        if (!pLevel.isClientSide) {
            // Use the supplier to create the correct projectile instance
            ThrowableBombProjectile projectile = projectileSupplier.get();
            projectile.setItem(itemStack);
            projectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 1.0F);
            pLevel.addFreshEntity(projectile);
        }

        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemStack, pLevel.isClientSide());
    }
}