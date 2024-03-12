package net.tw1zzler.throwablebombs.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static net.tw1zzler.throwablebombs.ThrowableBombs.*;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> BLACK_BOMB = ITEMS.register(
            "black_bomb", () -> new BlackBombItem(new Item.Properties())
    );
}
