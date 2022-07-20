package net.sylas.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sylas.tutorialmod.Sylas;

public class ModItems {

    public static final Item RAW_CHADONITE = regiasterItem("raw_chadonite",
            new Item(new FabricItemSettings().group(ModItemGroup.MODITEMS)));

    public static final Item CHADONITE = regiasterItem("chadonite",
            new Item(new FabricItemSettings().group(ModItemGroup.MODITEMS)));

    private static Item regiasterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Sylas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Sylas.LOGGER.debug("Registering Mod Items for " + Sylas.MOD_ID);
    }
}
