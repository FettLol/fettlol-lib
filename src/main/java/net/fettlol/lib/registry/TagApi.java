package net.fettlol.lib.registry;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TagApi {

    public static final Map<Identifier, Set<Identifier>> FETTLOL_ITEM_TAGS = new HashMap<>();

    public static Tag.Identified<Item> makeItemTag(Identifier identifier) {
        return TagFactory.ITEM.create(identifier);
    }

    public static Tag.Identified<Item> makeItemTag(String name) {
        return makeItemTag(new Identifier(name));
    }

    public static Tag.Identified<Item> makeItemTag(String namespace, String name) {
        return makeItemTag(new Identifier(namespace, name));
    }

    public static void assignItemTag(Tag.Identified<Item> tag, ItemConvertible... items) {
        Identifier tagId = tag.getId();
        Set<Identifier> set = FETTLOL_ITEM_TAGS.computeIfAbsent(tagId, k -> new HashSet<>());

        for (ItemConvertible item : items) {
            Identifier id = Registry.ITEM.getId(item.asItem());
            if (id != Registry.ITEM.getDefaultId()) {
                set.add(id);
            }
        }
    }

    public static void assignItemTag(Tag.Identified<Item> itemTag, String namespace, String item) {
        assignItemTag(itemTag, Registry.ITEM.get(new Identifier(namespace, item)));
    }

    public static ImmutableMap<Identifier, Set<Identifier>> buildItemTags() {
        return new ImmutableMap.Builder<Identifier, Set<Identifier>>().putAll(FETTLOL_ITEM_TAGS).build();
    }
}
