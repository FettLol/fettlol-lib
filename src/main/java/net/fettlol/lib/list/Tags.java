package net.fettlol.lib.list;

import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fettlol.lib.registry.TagApi;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

public class Tags {
    public static final Tag.Identified<Item> AE2_DUSTS;
    public static final Tag.Identified<Item> BLOCKUS_BARRELS;
    public static final Tag.Identified<Item> C_BOOKSHELVES;
    public static final Tag.Identified<Item> C_CHESTS;
    public static final Tag.Identified<Item> C_ENDER_PEARL_DUSTS;
    public static final Tag.Identified<Item> C_IRON_INGOTS;
    public static final Tag.Identified<Item> C_QUARTZ;
    public static final Tag.Identified<Item> C_SANDSTONE;
    public static final Tag.Identified<Item> C_VANILLAS;
    public static final Tag.Identified<Item> C_WOODEN_CHESTS;
    public static final Tag.Identified<Item> FABRIC_BOOTS;
    public static final Tag.Identified<Item> FABRIC_BOWS;
    public static final Tag.Identified<Item> FABRIC_CHESTPLATES;
    public static final Tag.Identified<Item> FABRIC_CROSSBOWS;
    public static final Tag.Identified<Item> FABRIC_HELMETS;
    public static final Tag.Identified<Item> FABRIC_LEGGINGS;
    public static final Tag.Identified<Item> FABRIC_SHIELDS;
    public static final Tag.Identified<Item> FETTLOL_GEMS;
    public static final Tag.Identified<Item> FETTLOL_RAINBOW_SAPLINGS;
    public static final Tag.Identified<Item> STONE_CRAFTING_MATERIALS;
    public static final Tag.Identified<Item> FABRIC_SHOVELS;
    public static final Tag.Identified<Item> FABRIC_AXES;
    public static final Tag.Identified<Item> FABRIC_PICKAXES;
    public static final Tag.Identified<Item> FABRIC_SWORDS;
    public static final Tag.Identified<Item> FABRIC_HOES;
    public static final Tag.Identified<Item> FABRIC_SHEARS;

    static {
        AE2_DUSTS = TagApi.makeItemTag("appliedenergistics2", "dusts");
        BLOCKUS_BARRELS = TagApi.makeItemTag("blockus", "barrels");
        C_BOOKSHELVES = TagApi.makeItemTag("c", "bookshelves");
        C_CHESTS = TagApi.makeItemTag("c", "chests");
        C_ENDER_PEARL_DUSTS = TagApi.makeItemTag("c", "ender_pearl_dusts");
        C_IRON_INGOTS = TagApi.makeItemTag("c", "iron_ingots");
        C_QUARTZ = TagApi.makeItemTag("c", "quartz");
        C_SANDSTONE = TagApi.makeItemTag("c", "sandstone");
        C_VANILLAS = TagApi.makeItemTag("c", "vanillas");
        C_WOODEN_CHESTS = TagApi.makeItemTag("c", "wooden_chests");
        FABRIC_BOOTS = TagApi.makeItemTag("fabric", "boots");
        FABRIC_BOWS = TagApi.makeItemTag("fabric", "bows");
        FABRIC_CHESTPLATES = TagApi.makeItemTag("fabric", "chestplates");
        FABRIC_CROSSBOWS = TagApi.makeItemTag("fabric", "crossbows");
        FABRIC_HELMETS = TagApi.makeItemTag("fabric", "helmets");
        FABRIC_LEGGINGS = TagApi.makeItemTag("fabric", "leggings");
        FABRIC_SHIELDS = TagApi.makeItemTag("fabric", "shields");
        FETTLOL_GEMS = TagApi.makeItemTag("fettlol:gems");
        FETTLOL_RAINBOW_SAPLINGS = TagApi.makeItemTag("fettlol:rainbow_saplings");
        STONE_CRAFTING_MATERIALS = TagApi.makeItemTag("minecraft", "stone_crafting_materials");

        // These are technically redundant but remain mainly for compatibility reasons as older
        // versions of fettlol-utilmod still use them. They will be removed in the future.
        FABRIC_SHOVELS = (Tag.Identified<Item>) FabricToolTags.SHOVELS;
        FABRIC_AXES = (Tag.Identified<Item>) FabricToolTags.AXES;
        FABRIC_PICKAXES = (Tag.Identified<Item>) FabricToolTags.PICKAXES;
        FABRIC_SWORDS = (Tag.Identified<Item>) FabricToolTags.SWORDS;
        FABRIC_HOES = (Tag.Identified<Item>) FabricToolTags.HOES;
        FABRIC_SHEARS = (Tag.Identified<Item>) FabricToolTags.SHEARS;
    }
}
