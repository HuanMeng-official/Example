package me.huanmeng.item;

import me.huanmeng.Example;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new FabricItemSettings()));
    public static final Item EXAMPLE_FOOD = registerItem("example_food", new Item(new FabricItemSettings().food(ModFoods.EXAMPLE_FOOD)));
    public static final Item EXAMPLE_AXE = registerItem("example_axe", new AxeItem(ModToolMaterial.EXAMPLE, 3, -3.0F, new FabricItemSettings()));
    public static final Item EXAMPLE_FUEL = registerItem("example_fuel", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Example.MODID, name), item);
    }

    public static void registryItem() {
    }
}
