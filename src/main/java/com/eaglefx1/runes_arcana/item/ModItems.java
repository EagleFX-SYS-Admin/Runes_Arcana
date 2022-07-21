package com.eaglefx1.runes_arcana.item;

import com.eaglefx1.runes_arcana.Runes_Arcana;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Runes_Arcana.MOD_ID);

    public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_FIRE = ITEMS.register("rune_of_fire",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_WATER = ITEMS.register("rune_of_water",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_AIR = ITEMS.register("rune_of_air",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_EARTH = ITEMS.register("rune_of_earth",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_ELECTRICITY = ITEMS.register("rune_of_electricity",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));

    public static final RegistryObject<Item> RUNE_OF_SPEED = ITEMS.register("rune_of_speed",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_LEAPING = ITEMS.register("rune_of_leaping",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_THE_NOCTOURANLS = ITEMS.register("rune_of_the_noctournals",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_HEALING = ITEMS.register("rune_of_healing",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_VIGOR = ITEMS.register("rune_of_vigor",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_SWIFT_MINING = ITEMS.register("rune_of_mining",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_LEVITATION = ITEMS.register("rune_of_levitation",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_DESTRUCTION = ITEMS.register("rune_of_destruction",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_CREATION = ITEMS.register("rune_of_creation",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_WINGS = ITEMS.register("rune_of_wings",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_FROST = ITEMS.register("rune_of_frost",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> RUNE_OF_FROZEN_TIME = ITEMS.register("rune_of_frozen_time",
            () -> new Item(new Item.Properties().tab(ModCreaticeModeTab.Runes_Arcana)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
