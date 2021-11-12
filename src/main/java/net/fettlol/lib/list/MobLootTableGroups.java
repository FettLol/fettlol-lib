package net.fettlol.lib.list;

import java.util.List;

public class MobLootTableGroups {

    public static final List<String> DROWNED;
    public static final List<String> ENDERMAN;
    public static final List<String> ENDER_DRAGON;
    public static final List<String> EVOKER;
    public static final List<String> GUARDIAN;
    public static final List<String> HUSK;
    public static final List<String> PHANTOM;
    public static final List<String> SHULKER;
    public static final List<String> STRAY;
    public static final List<String> WITCH;
    public static final List<String> WITHER_SKELETON;
    public static final List<String> ZOMBIE;

    static {
        DROWNED = List.of("minecraft:entities/drowned");
        ENDERMAN = List.of("minecraft:entities/enderman");
        ENDER_DRAGON = List.of("minecraft:entities/ender_dragon");
        EVOKER = List.of("minecraft:entities/evoker");
        GUARDIAN = List.of("minecraft:entities/guardian", "minecraft:entities/elder_guardian");
        HUSK = List.of("minecraft:entities/husk");
        PHANTOM = List.of("minecraft:entities/phantom");
        SHULKER = List.of("minecraft:entities/shulker");
        STRAY = List.of("minecraft:entities/stray");
        WITCH = List.of("minecraft:entities/witch");
        WITHER_SKELETON = List.of("minecraft:entities/wither_skeleton");
        ZOMBIE = List.of("minecraft:entities/zombie");
    }

}
