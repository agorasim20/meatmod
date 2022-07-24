package com.agorasim.meat;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;

public class MeatMod implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
			.build(new Identifier("meat", "general"), () -> new ItemStack(FoodRegistry.IRON_BEEF));
  
	@Override
	public void onInitialize() {
    	FoodRegistry.init();
	}
}
