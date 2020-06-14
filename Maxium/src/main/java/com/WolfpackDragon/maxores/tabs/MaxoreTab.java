package com.WolfpackDragon.maxores.tabs;

import com.WolfpackDragon.maxores.init.ModBlocks;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class MaxoreTab extends CreativeTabs{
	
	public MaxoreTab(String name) {
		super(Reference.MOD_ID + "." + name);
		//this.setBackgroundImageName("log_mythic.png");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.LOG_MYTHIC);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public void displayAllRelevantItems(NonNullList<ItemStack> listOfItems)
    {
		
        for (Item item : Item.REGISTRY)
        {
            item.getSubItems(this, listOfItems);
        }
    }
}
