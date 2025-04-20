package net.tw1zzler.throwablebombs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

import static net.tw1zzler.throwablebombs.entity.EntityInit.BLACK_BOMB_PROJECTILE;
import static net.tw1zzler.throwablebombs.item.ItemInit.BLACK_BOMB;

public class BlackBombProjectile extends ThrowableBombProjectile {

	public BlackBombProjectile(EntityType<? extends ThrowableBombProjectile> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	public BlackBombProjectile() {
		Level pLevel = null;
		EntityType<BlackBombProjectile> pEntityType = null;
		BlackBombProjectile(pEntityType, pLevel);
	}

	@Override
    protected Item getDefaultItem() {
        return BLACK_BOMB.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().explode(this, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
        }
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().explode(this, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
        }
        this.discard();
    }
}
