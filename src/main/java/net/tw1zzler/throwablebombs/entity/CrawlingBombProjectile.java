package net.tw1zzler.throwablebombs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.tw1zzler.throwablebombs.item.CrawlingBombItem;

import static net.tw1zzler.throwablebombs.entity.EntityInit.CRAWLING_BOMB_PROJECTILE;
import static net.tw1zzler.throwablebombs.entity.EntityInit.THROWABLE_BOMB_PROJECTILE;
import static net.tw1zzler.throwablebombs.item.ItemInit.BLACK_BOMB;
import static net.tw1zzler.throwablebombs.item.ItemInit.CRAWLING_BOMB;

public class CrawlingBombProjectile extends ThrowableItemProjectile {
    public CrawlingBombProjectile(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public CrawlingBombProjectile(Level pLevel) {
        super(CRAWLING_BOMB_PROJECTILE.get(), pLevel);
    }

    public CrawlingBombProjectile(Level pLevel, LivingEntity livingEntity) {
        super(CRAWLING_BOMB_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return CRAWLING_BOMB.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().explode(this, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().explode(this, this.getX(), this.getY(0.0625), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
        }
    }
}
