package com.eaglefx1.runes_arcana.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Runes_Arcana = new CreativeModeTab("Runes Arcana") {
        @Override
                public ItemStack makeIcon() {
                    return new ItemStack(ModItems.FIRE_RUNE.get());
        }
    };
}
