package throwablebombs.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static throwablebombs.ThrowableBombs.*;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Creates a new food item with the id "throwablebombs:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register(
            "example_item", () -> new Item(
                    new Item.Properties().food(
                            new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build()
                    )
            )
    );
    public static final RegistryObject<Item> THROWABLE_BOMB = ITEMS.register(
            "throwable_bomb", () -> new ThrowableBombItem(new Item.Properties())
    );
}
