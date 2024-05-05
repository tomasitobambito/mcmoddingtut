package net.tomasitobambito.tutorialmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tomasitobambito.tutorialmod.TutorialMod;
import net.tomasitobambito.tutorialmod.entity.custom.PorcupineEntity;

public class ModEntities {
    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TutorialMod.MOD_ID, "porcupine"),
            EntityType.Builder.create(PorcupineEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 1f).build());

    public static void registerModEntities() {
        TutorialMod.LOGGER.info("Registering Entities for " + TutorialMod.MOD_ID);
    }

}
