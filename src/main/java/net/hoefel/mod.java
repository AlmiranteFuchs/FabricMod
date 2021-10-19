package net.hoefel;


import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class mod implements ModInitializer {

    //Item
    public static final Item FABRIC_ITEM = new hoefelitem(new Item.Settings().group(ItemGroup.MISC));


    @Override
    public void onInitialize() {
        // Register elements of the mod
        Registry.register(Registry.ITEM, new Identifier("hoefelmod","hoefel"), FABRIC_ITEM);

    }

}