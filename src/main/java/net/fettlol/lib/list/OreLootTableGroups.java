package net.fettlol.lib.list;

import net.fettlol.lib.helper.ModIntegrationHelper;

import java.util.Arrays;
import java.util.List;

public class OreLootTableGroups {

    public static final List<String> DIAMOND_ORES;
    public static final List<String> LAPIS_ORES;

    static {
        DIAMOND_ORES = Arrays.asList(
            "minecraft:blocks/diamond_ore",
            "minecraft:blocks/deepslate_diamond_ore",
            "denseores:blocks/dense_deepslate_diamond_ore",
            "denseores:blocks/dense_diamond_ore"
        );

        LAPIS_ORES = Arrays.asList(
            "minecraft:blocks/lapis_ore",
            "minecraft:blocks/deepslate_lapis_ore",
            "denseores:blocks/dense_deepslate_lapis_ore",
            "denseores:blocks/dense_lapis_ore"
        );
    }

}
