package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModBlocks;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.util.BaseModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockFenceBase extends BlockFence implements BaseModel
{

	public BlockFenceBase(String name, Material materialIn, MapColor mapColorIn) {
		super(materialIn, mapColorIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(1.0F);
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
