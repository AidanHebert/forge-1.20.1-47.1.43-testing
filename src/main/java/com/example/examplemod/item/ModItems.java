package com.example.examplemod.item;

import com.example.examplemod.testburger;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS,testburger.MODID);


    public static final RegistryObject<Item> CHEESE = Items.register("cheese",
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);

    }



}
