package net.tw1zzler.throwablebombs.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tw1zzler.throwablebombs.entity.BlackBombProjectile;
import net.tw1zzler.throwablebombs.entity.CrawlingBombProjectile;
import net.tw1zzler.throwablebombs.entity.ThrowableBombProjectile;

import static net.tw1zzler.throwablebombs.ThrowableBombs.*;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> BLACK_BOMB = ITEMS.register(
            "black_bomb", () -> new ThrowableBombItem(
                    new Item.Properties(),
                            () -> new BlackBombProjectile()
            ));
    public static final RegistryObject<Item> CRAWLING_BOMB = ITEMS.register(
            "crawling_bomb", () -> new ThrowableBombItem(
                    new Item.Properties(),
                    () -> new CrawlingBombProjectile()
            ));
//    public static final RegistryObject<Item> SUPER_BOMB = ITEMS.register(
//            "super_bomb", () -> new ThrowableBombItem(
//                    new Item.Properties(),
//                    () -> new SuperBombProjectile()
//            ));
}