package net.fettlol.lib.api;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Optional;

public final class FettlolAPI {

    /**
     * Add an item to the CompostingChanceRegistry.
     *
     * @param item The Item to make compostable.
     * @param value The chance for this item to generate an increase in the Composter's level.
     */
    public static void makeCompostable(Item item, float value) {
        CompostingChanceRegistry.INSTANCE.add(item, value);
    }

    /**
     * Allow making things compostable by passing the Identifier, too, assuming it checks out in the registry.
     */
    public static void makeCompostable(Identifier identifier, float value) {
        Optional<Item> maybeItem = Registry.ITEM.getOrEmpty(identifier);
        maybeItem.ifPresent(item -> makeCompostable(item, value));
    }

}
