package dev.mayaqq.estrogen.platform.fabric;

import dev.mayaqq.estrogen.fabric.tooltip.FabricThighHighsTooltip;
import dev.mayaqq.estrogen.registry.items.ThighHighsItem;
import dev.mayaqq.estrogen.registry.tooltip.ThighHighsToolTipModifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

public class CommonPlatformImpl {
    public static Supplier<Item> createSpawnEggItem(Supplier<? extends EntityType<? extends Mob>> type, int primaryColor, int secondaryColor, Item.Properties properties) {
        return () -> new SpawnEggItem(type.get(), primaryColor, secondaryColor, properties);
    }

    public static TagKey<Item> getShearsTag() {
        return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation("c", "shears"));
    }

    public static ThighHighsToolTipModifier createThighHighTooltip(Item item) {
        return new FabricThighHighsTooltip((ThighHighsItem) item);
    }
}
