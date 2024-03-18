package net.tw1zzler.throwablebombs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import static net.tw1zzler.throwablebombs.item.ItemInit.BLACK_BOMB;
import static net.tw1zzler.throwablebombs.item.ItemInit.CRAWLING_BOMB;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, BLACK_BOMB.get(), 8)
                .pattern(" GS")
                .pattern("GBG")
                .pattern(" G ")
                .define('G', Items.GUNPOWDER)
                .define('S', Items.STRING)
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.GUNPOWDER))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CRAWLING_BOMB.get(), 8)
                .pattern("EGS")
                .pattern("GYG")
                .pattern("EGE")
                .define('G', Items.GUNPOWDER)
                .define('S', Items.STRING)
                .define('Y', Items.YELLOW_DYE)
                .define('E', Items.SPIDER_EYE)
                .unlockedBy(getHasName(Items.SPIDER_EYE), has(Items.SPIDER_EYE))
                .save(recipeOutput);
    }
}
