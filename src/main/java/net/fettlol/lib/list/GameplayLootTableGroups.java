package net.fettlol.lib.list;

import net.minecraft.loot.LootTables;

import java.util.Arrays;
import java.util.List;

public class GameplayLootTableGroups {

    public static List<String> CAT_MORNING_GIFT;
    public static List<String> FISHING_TREASURES;
    public static List<String> PIGLIN_BARTERING;

    static {
        CAT_MORNING_GIFT = Arrays.asList(LootTables.CAT_MORNING_GIFT_GAMEPLAY.toString());
        FISHING_TREASURES = Arrays.asList(LootTables.FISHING_TREASURE_GAMEPLAY.toString());
        PIGLIN_BARTERING = Arrays.asList(LootTables.PIGLIN_BARTERING_GAMEPLAY.toString());
    }

}
