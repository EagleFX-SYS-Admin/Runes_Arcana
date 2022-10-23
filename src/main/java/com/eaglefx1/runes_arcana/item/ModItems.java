package com.eaglefx1.runes_arcana.item;

import com.eaglefx1.runes_arcana.Runes_Arcana;
import com.eaglefx1.runes_arcana.item.custom.DieOfFate;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Runes_Arcana.MOD_ID);

    public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> FIRE_RUNE = ITEMS.register("fire_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> WATER_RUNE = ITEMS.register("water_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> AIR_RUNE = ITEMS.register("air_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> EARTH_RUNE = ITEMS.register("earth_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> ENERGY_RUNE = ITEMS.register("energy_rune",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana)));
    public static final RegistryObject<Item> DieOfFate = ITEMS.register("die_of_fate",
            () -> new DieOfFate(new Item.Properties().tab(ModCreativeModeTab.Runes_Arcana).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
