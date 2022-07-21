package net.sylas.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.sylas.tutorialmod.Sylas;
import net.sylas.tutorialmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block CHADONITE_BLOCK = registerBlock("chadonite_block",
            new Block(FabricBlockSettings.of(Material.METAL).luminance((4)).strength(5f)), ModItemGroup.MODITEMS);

    public static final Block CHADONITE_ORE = registerBlock("chadonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance((4)).strength(5f).requiresTool(),
                    UniformIntProvider.create(10, 30)),ModItemGroup.MODITEMS);

    public static final Block DEEPSLATE_CHADONITE_ORE = registerBlock("deepslate_chadonite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance((4)).strength(7f).requiresTool(),
                    UniformIntProvider.create(10, 30)),ModItemGroup.MODITEMS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Sylas.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Sylas.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        Sylas.LOGGER.debug("Registering ModBlocks for " + Sylas.MOD_ID);
    }
}
