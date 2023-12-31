package net.kadencarr.carrsmod.item;


import net.kadencarr.carrsmod.CarrsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CarrsMod.MOD_ID);

    public static final RegistryObject<Item> CAR = ITEMS.register("car",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
            () -> new Item(new Item.Properties()));


    public static ArrayList<Item> returnItems() {
        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(CAR.get());
        itemList.add(LITHIUM.get());

        return itemList;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
