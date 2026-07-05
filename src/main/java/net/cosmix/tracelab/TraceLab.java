package net.cosmix.tracelab;

import net.cosmix.tracelab.item.ModItemGroups;
import net.cosmix.tracelab.item.Moditems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraceLab implements ModInitializer {
	public static final String MOD_ID = "tracelab";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();
		Moditems.registerModItems();


	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
