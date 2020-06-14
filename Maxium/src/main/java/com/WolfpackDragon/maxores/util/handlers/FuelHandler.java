package com.WolfpackDragon.maxores.util.handlers;

import com.WolfpackDragon.maxores.init.ModBlocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

public class FuelHandler extends FurnaceFuelBurnTimeEvent{

	public FuelHandler(ItemStack itemStack, int burnTime) {
		super(itemStack, burnTime);
		if(itemStack.getItem() == Item.getItemFromBlock((ModBlocks.LOG_MYTHIC))) {
			setBurnTime(3);
		}
	}

}
