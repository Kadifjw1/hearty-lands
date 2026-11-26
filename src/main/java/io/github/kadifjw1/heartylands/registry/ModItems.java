package io.github.kadifjw1.heartylands.registry;

import io.github.kadifjw1.heartylands.HeartyLands;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/** Все предметы мода. Чтобы добавить новый — одна строка здесь + модель, текстура и перевод. */
public final class ModItems {
    private ModItems() {}

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HeartyLands.MODID);

    public static final DeferredItem<Item> FRIED_EGG = ITEMS.registerSimpleItem("fried_egg",
            new Item.Properties().food(ModFoods.FRIED_EGG));

    public static final DeferredItem<Item> VEGETABLE_STEW = ITEMS.registerSimpleItem("vegetable_stew",
            new Item.Properties().food(ModFoods.VEGETABLE_STEW).stacksTo(16));

    public static final DeferredItem<Item> BERRY_PIE = ITEMS.registerSimpleItem("berry_pie",
            new Item.Properties().food(ModFoods.BERRY_PIE));

    public static final DeferredItem<Item> MEAT_SANDWICH = ITEMS.registerSimpleItem("meat_sandwich",
            new Item.Properties().food(ModFoods.MEAT_SANDWICH));
}
