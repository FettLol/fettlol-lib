package net.fettlol.lib.list;

import net.fettlol.lib.helper.ModIntegrationHelper;
import net.minecraft.loot.LootTables;

import java.util.Arrays;
import java.util.List;

public class ChestLootTableGroups {

    public static final List<String> ABANDONED_MINESHAFT_CHESTS;
    public static final List<String> BURIED_TREASURE_CHESTS;
    public static final List<String> DESERT_PYRAMID_CHESTS;
    public static final List<String> END_ENDGAME_CHESTS;
    public static final List<String> GRAVEYARD_LOOT_CHESTS;
    public static final List<String> MANSION_CHESTS;
    public static final List<String> NETHER_ENDGAME_CHESTS;
    public static final List<String> NETHER_TEMPLE_CHESTS;
    public static final List<String> RUINED_PORTAL_CHESTS;
    public static final List<String> SHIPWRECK_CHESTS;
    public static final List<String> SIMPLE_DUNGEON_CHESTS;
    public static final List<String> STRONGHOLD_CHESTS;
    public static final List<String> UNDERWATER_RUIN_CHESTS;
    public static final List<String> VILLAGE_HOUSE_CHESTS;

    static {
        ABANDONED_MINESHAFT_CHESTS = Arrays.asList(
            LootTables.ABANDONED_MINESHAFT_CHEST.toString());

        BURIED_TREASURE_CHESTS = Arrays.asList(
            LootTables.BURIED_TREASURE_CHEST.toString()
        );

        DESERT_PYRAMID_CHESTS = Arrays.asList(
            LootTables.DESERT_PYRAMID_CHEST.toString()
        );

        END_ENDGAME_CHESTS = Arrays.asList(
            LootTables.END_CITY_TREASURE_CHEST.toString()
        );

        // Empty by default, only has an effect when used with mod: graveyard.
        GRAVEYARD_LOOT_CHESTS = Arrays.asList();

        MANSION_CHESTS = Arrays.asList(
            LootTables.WOODLAND_MANSION_CHEST.toString()
        );

        NETHER_ENDGAME_CHESTS = Arrays.asList(
            LootTables.BASTION_BRIDGE_CHEST.toString(),
            LootTables.BASTION_TREASURE_CHEST.toString(),
            LootTables.BASTION_HOGLIN_STABLE_CHEST.toString(),
            LootTables.BASTION_OTHER_CHEST.toString(),
            LootTables.NETHER_BRIDGE_CHEST.toString()
        );

        // Empty by default, only has an effect when used with mod: repurposed_structures.
        NETHER_TEMPLE_CHESTS = Arrays.asList();

        RUINED_PORTAL_CHESTS = Arrays.asList(
            LootTables.RUINED_PORTAL_CHEST.toString()
        );

        SHIPWRECK_CHESTS = Arrays.asList(
            LootTables.SHIPWRECK_SUPPLY_CHEST.toString(),
            LootTables.SHIPWRECK_TREASURE_CHEST.toString()
        );

        SIMPLE_DUNGEON_CHESTS = Arrays.asList(
            LootTables.SIMPLE_DUNGEON_CHEST.toString()
        );

        STRONGHOLD_CHESTS = Arrays.asList(
            LootTables.STRONGHOLD_CORRIDOR_CHEST.toString(),
            LootTables.STRONGHOLD_CROSSING_CHEST.toString(),
            LootTables.STRONGHOLD_LIBRARY_CHEST.toString()
        );

        UNDERWATER_RUIN_CHESTS = Arrays.asList(
            LootTables.UNDERWATER_RUIN_BIG_CHEST.toString(),
            LootTables.UNDERWATER_RUIN_SMALL_CHEST.toString()
        );

        VILLAGE_HOUSE_CHESTS = Arrays.asList(
            LootTables.VILLAGE_DESERT_HOUSE_CHEST.toString(),
            LootTables.VILLAGE_PLAINS_CHEST.toString(),
            LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.toString(),
            LootTables.VILLAGE_SNOWY_HOUSE_CHEST.toString(),
            LootTables.VILLAGE_TAIGA_HOUSE_CHEST.toString()
        );

        // ======= Mod-specific Integrations Below =======

        if (ModIntegrationHelper.isModLoaded(Mods.REPURPOSED_STUCTURES)) {
            ABANDONED_MINESHAFT_CHESTS.addAll(List.of(
                "repurposed_structures:chests/mineshafts/birch",
                "repurposed_structures:chests/mineshafts/crimson",
                "repurposed_structures:chests/mineshafts/dark_forest",
                "repurposed_structures:chests/mineshafts/desert",
                "repurposed_structures:chests/mineshafts/end",
                "repurposed_structures:chests/mineshafts/icy",
                "repurposed_structures:chests/mineshafts/jungle",
                "repurposed_structures:chests/mineshafts/nether",
                "repurposed_structures:chests/mineshafts/ocean",
                "repurposed_structures:chests/mineshafts/savanna",
                "repurposed_structures:chests/mineshafts/stone",
                "repurposed_structures:chests/mineshafts/swamp",
                "repurposed_structures:chests/mineshafts/taiga",
                "repurposed_structures:chests/mineshafts/warped"
            ));

            MANSION_CHESTS.addAll(List.of(
                "repurposed_structures:chests/mansions/birch",
                "repurposed_structures:chests/mansions/desert",
                "repurposed_structures:chests/mansions/jungle",
                "repurposed_structures:chests/mansions/oak",
                "repurposed_structures:chests/mansions/savanna",
                "repurposed_structures:chests/mansions/snowy",
                "repurposed_structures:chests/mansions/taiga"
            ));

            SHIPWRECK_CHESTS.addAll(List.of(
                "repurposed_structures:chests/shipwrecks/crimson/treasure",
                "repurposed_structures:chests/shipwrecks/end/treasure",
                "repurposed_structures:chests/shipwrecks/nether_bricks/treasure",
                "repurposed_structures:chests/shipwrecks/warped/treasure"
            ));

            NETHER_TEMPLE_CHESTS.addAll(List.of(
                "repurposed_structures:chests/temples/nether_basalt",
                "repurposed_structures:chests/temples/nether_crimson",
                "repurposed_structures:chests/temples/nether_soul",
                "repurposed_structures:chests/temples/nether_warped",
                "repurposed_structures:chests/temples/nether_wasteland"
            ));

            SIMPLE_DUNGEON_CHESTS.addAll(List.of(
                "repurposed_structures:chests/dungeons/badlands",
                "repurposed_structures:chests/dungeons/dark_forest",
                "repurposed_structures:chests/dungeons/desert",
                "repurposed_structures:chests/dungeons/icy",
                "repurposed_structures:chests/dungeons/jungle",
                "repurposed_structures:chests/dungeons/mushroom",
                "repurposed_structures:chests/dungeons/nether",
                "repurposed_structures:chests/dungeons/ocean",
                "repurposed_structures:chests/dungeons/snow",
                "repurposed_structures:chests/dungeons/swamp"
            ));

            STRONGHOLD_CHESTS.addAll(List.of(
                "repurposed_structures:chests/strongholds/nether_hallway",
                "repurposed_structures:chests/strongholds/nether_library",
                "repurposed_structures:chests/strongholds/nether_storage_room"
            ));

            VILLAGE_HOUSE_CHESTS.addAll(List.of(
                "repurposed_structures:chests/villages/badlands_house",
                "repurposed_structures:chests/villages/birch_house",
                "repurposed_structures:chests/villages/crimson_house",
                "repurposed_structures:chests/villages/dark_forest_house",
                "repurposed_structures:chests/villages/giant_taiga_house",
                "repurposed_structures:chests/villages/jungle_house",
                "repurposed_structures:chests/villages/mountains_house",
                "repurposed_structures:chests/villages/oak_house",
                "repurposed_structures:chests/villages/swamp_house",
                "repurposed_structures:chests/villages/warped_house"
            ));

        }

        if (ModIntegrationHelper.isModLoaded(Mods.GRAVEYARD)) {
            GRAVEYARD_LOOT_CHESTS.addAll(List.of(
                "graveyard:chests/small_loot",
                "graveyard:chests/medium_loot",
                "graveyard:chests/large_loot"
            ));
        }

        if (ModIntegrationHelper.isModLoaded(Mods.STONEHOLM)) {
            VILLAGE_HOUSE_CHESTS.add("stoneholm:bedroom");
        }

        if (ModIntegrationHelper.isModLoaded(Mods.BYG)) {
            ABANDONED_MINESHAFT_CHESTS.add("byg:chests/abandoned_mineshaft");
            BURIED_TREASURE_CHESTS.add("byg:chests/buried_treasure");
            DESERT_PYRAMID_CHESTS.add("byg:chests/desert_pyramid");
            END_ENDGAME_CHESTS.add("byg:chests/end_city_treasure");
            NETHER_ENDGAME_CHESTS.add("byg:chest/nether_bridge");
            SHIPWRECK_CHESTS.add("byg:chests/shipwreck_treasure");
            SIMPLE_DUNGEON_CHESTS.add("byg:chests/simple_dungeon");

            UNDERWATER_RUIN_CHESTS.addAll(List.of(
                "byg:chests/underwater_ruin_small",
                "byg:chests/underwater_run_big"
            ));

            VILLAGE_HOUSE_CHESTS.addAll(List.of(
                "byg:chests/village/village_skyris_house",
                "byg:chests/village/village_tropics_house"
            ));

            STRONGHOLD_CHESTS.addAll(List.of(
                "byg:chests/stronghold_library",
                "byg:chests/stronghold_corridor",
                "byg:chests/stronghold_crossing"
            ));
        }

    }
}
