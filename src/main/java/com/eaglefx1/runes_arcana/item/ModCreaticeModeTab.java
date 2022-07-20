package com.eaglefx1.runes_arcana.item;

import com.eaglefx1.runes_arcana.Runes_Arcana;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreaticeModeTab {
    public static final CreativeModeTab Runes_Arcana = new CreativeModeTab("Runes Arcana") {
        @Override
                public ItemStack makeIcon() {
                    return new ItemStack(ModItems.RUNE_OF_FIRE.get());
        }
    };
}
