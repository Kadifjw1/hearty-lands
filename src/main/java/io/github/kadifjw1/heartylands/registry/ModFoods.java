package io.github.kadifjw1.heartylands.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

/**
 * Свойства еды: сколько голода восстанавливает (nutrition)
 * и насколько долго держит сытость (saturationModifier).
 * Для сравнения: хлеб = 5 / 0.6, жареная говядина = 8 / 0.8.
 */
public final class ModFoods {
    private ModFoods() {}

    /** Яичница: простой быстрый перекус из яйца. */
    public static final FoodProperties FRIED_EGG = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.6f).fast().build();

    /** Овощное рагу: возвращает миску, как грибной суп. */
    public static final FoodProperties VEGETABLE_STEW = new FoodProperties.Builder()
            .nutrition(9).saturationModifier(0.7f)
            .usingConvertsTo(Items.BOWL).build();

    /** Ягодный пирог: сладкий, немного ускоряет на короткое время. */
    public static final FoodProperties BERRY_PIE = new FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.5f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 20, 0), 1.0f)
            .build();

    /** Сэндвич с мясом: сытная еда в дорогу. */
    public static final FoodProperties MEAT_SANDWICH = new FoodProperties.Builder()
            .nutrition(11).saturationModifier(0.8f).build();
}
