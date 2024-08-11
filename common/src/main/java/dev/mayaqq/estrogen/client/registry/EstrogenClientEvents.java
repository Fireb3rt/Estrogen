package dev.mayaqq.estrogen.client.registry;

import dev.mayaqq.estrogen.client.features.UwUfy;
import dev.mayaqq.estrogen.client.registry.entityRenderers.moth.MothModel;
import dev.mayaqq.estrogen.client.registry.particles.DashParticle;
import dev.mayaqq.estrogen.registry.EstrogenParticles;
import dev.mayaqq.estrogen.utils.EstrogenParticleRegistrator;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EstrogenClientEvents {
    public static void onDisconnect() {
        UwUfy.disconnect();
    }

    public static void onRegisterParticles(BiConsumer<ParticleType<SimpleParticleType>, EstrogenParticleRegistrator<SimpleParticleType>> consumer) {
        consumer.accept(EstrogenParticles.DASH.get(), DashParticle.Provider::new);
    }

    public static void registerModelLayer(LayerDefinitionRegistry consumer) {
        consumer.register(MothModel.LAYER_LOCATION, MothModel::createBodyLayer);
    }

    @FunctionalInterface
    public interface LayerDefinitionRegistry {

        void register(ModelLayerLocation location, Supplier<LayerDefinition> definition);
    }
}
