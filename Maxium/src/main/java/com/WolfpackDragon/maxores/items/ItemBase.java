package com.WolfpackDragon.maxores.items;

import java.util.Map;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.util.BaseModel;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements BaseModel {
	private static int itemBurnTime;
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(null); 
		setCreativeTab(Main.MAXORE);
		setItemBurnTime(-1);
		ModItems.ITEMS.add(this);
	}
	
	public ItemBase(String name, int bTime) {
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(null); 
		setCreativeTab(Main.MAXORE);
		setItemBurnTime(bTime);
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModls() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override 
	public int getItemBurnTime(ItemStack itemStack) {
		return this.itemBurnTime;
	}
	
	public static void setItemBurnTime(int burnTime) {
		itemBurnTime = burnTime;
	}
}
