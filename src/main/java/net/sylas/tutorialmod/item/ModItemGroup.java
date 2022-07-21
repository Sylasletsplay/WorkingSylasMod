package net.sylas.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sylas.tutorialmod.Sylas;

public class ModItemGroup {

    public static final ItemGroup MODITEMS = FabricItemGroupBuilder.build(
            new Identifier(Sylas.MOD_ID, "moditems"), () -> new ItemStack(ModItems.CHADONITE_INGOT));
}



