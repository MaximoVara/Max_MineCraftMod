package com.WolfpackDragon.maxores.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init(){
		GameRegistry.addSmelting(ModItems.MYTHRIL_RAW, new ItemStack(ModItems.MYTHRIL_INGOT, 1) , 1.0F);
		GameRegistry.addSmelting(ModBlocks.CORUNDUM_ORE , new ItemStack(ModItems.CORUNDUM, 1) , 1.0F);
	}
}
