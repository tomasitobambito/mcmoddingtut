package net.tomasitobambito.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.tomasitobambito.tutorialmod.block.ModBlocks;
import net.tomasitobambito.tutorialmod.entity.ModEntities;
import net.tomasitobambito.tutorialmod.entity.client.ModModelLayers;
import net.tomasitobambito.tutorialmod.entity.client.PorcupineModel;
import net.tomasitobambito.tutorialmod.entity.client.PorcupineRenderer;

public class TutorialModClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }
    
}
