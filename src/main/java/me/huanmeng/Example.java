package me.huanmeng;

import me.huanmeng.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("example");
	public static final String MODID = "example";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registryItem();
	}
}