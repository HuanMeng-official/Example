package me.huanmeng;

import me.huanmeng.block.ModBlocks;
import me.huanmeng.group.ModGroup;
import me.huanmeng.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("example");
	public static final String MODID = "example";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registryItem();
		ModGroup.registryGroup();
		ModBlocks.registryBlock();

		FuelRegistry.INSTANCE.add(ModItems.EXAMPLE_FUEL, 200);
	}
}