package net.tw1zzler.throwablebombs.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.tw1zzler.throwablebombs.ThrowableBombs.MODID;

/**
 * Class to initalize all entities for Throwable Bombs.
 * @author tw1zzler
 */
public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, MODID);

    public static final RegistryObject<EntityType<BlackBombProjectile>> BLACK_BOMB_PROJECTILE = ENTITY_TYPES.register(
            "black_bomb_projectile", () -> EntityType.Builder.<BlackBombProjectile>of(
                    BlackBombProjectile::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .build("throwable_bomb_projectile"));

    public static final RegistryObject<EntityType<CrawlingBombProjectile>> CRAWLING_BOMB_PROJECTILE = ENTITY_TYPES.register(
            "crawling_bomb_projectile", () -> EntityType.Builder.<CrawlingBombProjectile>of(
                    CrawlingBombProjectile::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .build("crawling_bomb_projectile"));

//    public static final RegistryObject<EntityType<SuperBombProjectile>> SUPER_BOMB_PROJECTILE = ENTITY_TYPES.register(
//            "super_bomb_projectile", () -> EntityType.Builder.<SuperBombProjectile>of(
//                    SuperBombProjectile::new, MobCategory.MISC)
//                    .sized(0.5F, 0.5F)
//                    .build("super_bomb_projectile"));
}
