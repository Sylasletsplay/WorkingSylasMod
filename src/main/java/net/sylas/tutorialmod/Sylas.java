package net.sylas.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.sylas.tutorialmod.block.ModBlocks;
import net.sylas.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sylas implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
