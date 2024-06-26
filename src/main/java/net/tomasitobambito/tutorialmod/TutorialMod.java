package net.tomasitobambito.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.tomasitobambito.tutorialmod.block.ModBlocks;
import net.tomasitobambito.tutorialmod.entity.ModEntities;
import net.tomasitobambito.tutorialmod.entity.custom.PorcupineEntity;
import net.tomasitobambito.tutorialmod.item.ModItemGroups;
import net.tomasitobambito.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRICKLET, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}