package dev.mayaqq.estrogen.registry;

import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.mayaqq.estrogen.Estrogen;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import uwu.serenity.critter.api.entry.RegistryEntry;
import uwu.serenity.critter.stdlib.Registrar;

public class EstrogenPotions {
    public static final Registrar<Potion> POTIONS = Registrar.create(Estrogen.MOD_ID, Registries.POTION);

    public static final RegistryEntry<Potion> ESTROGEN_POTION = POTIONS.entry("estrogen", () ->
            new Potion("estrogen", new MobEffectInstance(EstrogenEffects.ESTROGEN_EFFECT.get(), 12000))
    ).register();
}
