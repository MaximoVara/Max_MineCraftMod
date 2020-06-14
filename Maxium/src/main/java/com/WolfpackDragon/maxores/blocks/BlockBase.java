package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModBlocks;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.items.ItemBase;
import com.WolfpackDragon.maxores.util.BaseModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements BaseModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(null); 
		setCreativeTab(Main.MAXORE);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModls() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
