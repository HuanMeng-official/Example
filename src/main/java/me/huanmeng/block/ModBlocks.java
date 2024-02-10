package me.huanmeng.block;

import me.huanmeng.Example;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EXAMPLE_BLOCK = registerBlocks("example_block", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static Block registerBlocks(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Example.MODID, name), block);
    }

    public static void registerBlockItems(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Example.MODID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registryBlock() {
    }
}
