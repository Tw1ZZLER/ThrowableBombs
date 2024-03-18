package net.tw1zzler.throwablebombs.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.tw1zzler.throwablebombs.ThrowableBombs.MODID;
import static net.tw1zzler.throwablebombs.item.ItemInit.*;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "throwablebombs:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> THROWABLE_BOMBS_TAB = CREATIVE_MODE_TABS.register("throwable_bombs_tab",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.throwablebombs_tab"))
            .withTabsBefore(net.minecraft.world.item.CreativeModeTabs.COMBAT)
            .icon(() -> BLACK_BOMB.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BLACK_BOMB.get());
                output.accept(CRAWLING_BOMB.get());
            })
            .build()
    );
}
