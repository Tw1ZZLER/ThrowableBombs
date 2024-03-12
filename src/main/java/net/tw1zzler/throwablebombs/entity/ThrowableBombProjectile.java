package net.tw1zzler.throwablebombs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.tw1zzler.throwablebombs.item.ThrowableBombItem;

/**
 * Class describes logic for bombs as entities
 * @author tw1zzler
 */
public class ThrowableBombProjectile extends ThrowableItemProjectile {

    private Explosion level;

    public ThrowableBombProjectile(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        // this, x, y, z, explosionStrength, setsFires, breakMode
        this.level.explode();
    }
    @Override
    protected Item getDefaultItem() {
        return (new ThrowableBombItem(new Item.Properties()));
    }
}
