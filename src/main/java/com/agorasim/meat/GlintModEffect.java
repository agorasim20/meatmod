package com.agorasim.meat;

import net.minecraft.item.Item;

public class GlintModEffect extends Item {

    public GlintModEffect(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(net.minecraft.item.ItemStack stack) {
        return true;
    }
    
}
