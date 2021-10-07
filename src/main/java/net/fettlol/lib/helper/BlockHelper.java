package net.fettlol.lib.helper;

import net.minecraft.block.Block;
import net.minecraft.block.WitherRoseBlock;
import net.minecraft.tag.BlockTags;

public class BlockHelper {

    public static boolean isFlower(Block block) {
        return blockIsNotWitherRose(block)
            && (BlockTags.SMALL_FLOWERS.contains(block) || BlockTags.TALL_FLOWERS.contains(block));
    }

    private static boolean blockIsNotWitherRose(Block block) {
        return block.getClass() != WitherRoseBlock.class;
    }

}
