package net.cosmix.tracelab.item;

import net.cosmix.tracelab.TraceLab;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TraceLab_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TraceLab.MOD_ID, "test_tube"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test_tube"))
                    .icon(() -> new ItemStack(Moditems.FullTestTube)).entries((displayContext, entries) -> {

                        entries.add(Moditems.FullTestTube);
                        entries.add(Moditems.TestTube);
                        entries.add(Moditems.UVTorch);
                        entries.add(Moditems.TestedTampon);
                        entries.add(Moditems.TestTampon);


                    }).build());



    public static void registerItemsGroups() {
        TraceLab.LOGGER.info("Registering Item Groups for " +TraceLab.MOD_ID);
    }
}
