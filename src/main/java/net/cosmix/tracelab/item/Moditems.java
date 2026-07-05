package net.cosmix.tracelab.item;

import net.cosmix.tracelab.TraceLab;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.IdentityHashMap;

public class Moditems {
    public static final Item UVTorch = registerItem("uvtorch", new Item(new FabricItemSettings()));
    public static final Item TestTube = registerItem("test_tube", new Item(new FabricItemSettings()));
    public static final Item FullTestTube = registerItem("full_test_tube", new Item(new FabricItemSettings()));
    public static final Item TestTampon = registerItem("test_tampon", new Item(new FabricItemSettings()));
    public static final Item TestedTampon = registerItem("tested_tampon", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(UVTorch);
        entries.add(TestTampon);
        entries.add(TestedTampon);
        entries.add(TestTube);
        entries.add(FullTestTube);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TraceLab.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TraceLab.LOGGER.info("Registring Mod Items For " + TraceLab.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientTabItemGroup);
    }
}
