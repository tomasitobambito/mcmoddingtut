package net.tomasitobambito.tutorialmod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.tomasitobambito.tutorialmod.TutorialMod;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(TutorialMod.MOD_ID, "porcupine"), "main");
}
