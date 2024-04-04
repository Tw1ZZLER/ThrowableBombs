package net.tw1zzler.throwablebombs.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tw1zzler.throwablebombs.item.CrawlingBombItem;

import java.util.ArrayList;

import static net.tw1zzler.throwablebombs.ThrowableBombs.MODID;

/**
 * Class to initalize all entities for Throwable Bombs.
 * @author tw1zzler
 */

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, MODID);

    public static final RegistryObject<EntityType<ThrowableBombProjectile>> THROWABLE_BOMB_PROJECTILE = ENTITY_TYPES.register(
            "throwable_bomb_projectile", () -> EntityType.Builder.<ThrowableBombProjectile>of(
                    ThrowableBombProjectile::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .build("throwable_bomb_projectile"));

    public static final RegistryObject<EntityType<CrawlingBombProjectile>> CRAWLING_BOMB_PROJECTILE = ENTITY_TYPES.register(
            "crawling_bomb_projectile", () -> EntityType.Builder.<CrawlingBombProjectile>of(
                    CrawlingBombProjectile::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .build("crawling_bomb_projectile"));


    public static final ArrayList<RegistryObject<EntityType<?>>> projectileArray = new ArrayList<>();
    projectileArray.add(THROWABLE_BOMB_PROJECTILE);
    projectileArray.add(CRAWLING_BOMB_PROJECTILE);
}
