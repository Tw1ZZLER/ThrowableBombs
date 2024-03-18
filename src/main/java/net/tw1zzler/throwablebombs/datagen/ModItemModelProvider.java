package net.tw1zzler.throwablebombs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static net.tw1zzler.throwablebombs.ThrowableBombs.MODID;
import static net.tw1zzler.throwablebombs.item.ItemInit.BLACK_BOMB;
import static net.tw1zzler.throwablebombs.item.ItemInit.CRAWLING_BOMB;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(BLACK_BOMB);
        simpleItem(CRAWLING_BOMB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MODID, "item/" + item.getId().getPath())
        );

    }
}
