package net.fettlol.lib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lib implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("fettlol-lib");

	public static final String MOD_ID = "fettlol-lib";

	@Override
	public void onInitialize() {
		// Nothing here yet.
	}
}
