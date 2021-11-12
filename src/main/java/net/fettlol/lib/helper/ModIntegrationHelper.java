package net.fettlol.lib.helper;

import net.fabricmc.loader.api.FabricLoader;

/**
 * This class contains helper methods having to do with interactions towards other
 * mods, such as checking whether they are loaded and stuff like that.
 */
public class ModIntegrationHelper {

    public static boolean isModLoaded(String mod) {
        return FabricLoader.getInstance().isModLoaded(mod);
    }

}
