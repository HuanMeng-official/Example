package me.huanmeng.item;

import me.huanmeng.Example;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EXAMPL_ITEM = Registry.register(Registries.ITEM,
            new Identifier(Example.MODID, "example_item"),
            new Item(new FabricItemSettings()));

    public static void registryItem() {
    }
}
