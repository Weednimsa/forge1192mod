package net.weednimsa.pap.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Pap_Tab = new CreativeModeTab("paptab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ENDERIUM.get());
        }
    };
}
