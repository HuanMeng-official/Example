package me.huanmeng.group;

import me.huanmeng.Example;
import me.huanmeng.block.ModBlocks;
import me.huanmeng.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroup {

    public static final ItemGroup GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Example.MODID, "group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.example.group"))
                    .icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EXAMPLE_ITEM);
                        entries.add(ModItems.EXAMPLE_FOOD);
                        entries.add(ModBlocks.EXAMPLE_BLOCK);
                        entries.add(ModItems.EXAMPLE_AXE);
                        entries.add(ModItems.EXAMPLE_FUEL);
                    })
                    .build());

    public static void registryGroup() {
    }
}
