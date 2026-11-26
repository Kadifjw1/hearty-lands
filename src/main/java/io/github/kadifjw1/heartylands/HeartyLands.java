package io.github.kadifjw1.heartylands;

import com.mojang.logging.LogUtils;
import io.github.kadifjw1.heartylands.registry.ModCreativeTabs;
import io.github.kadifjw1.heartylands.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/** Главный класс мода «Сытный край». Отсюда регистрируется всё остальное. */
@Mod(HeartyLands.MODID)
public class HeartyLands {
    public static final String MODID = "heartylands";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HeartyLands(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
        LOGGER.info("Сытный край загружается");
    }
}
