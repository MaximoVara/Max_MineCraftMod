package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.items.ItemBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class MythicWood extends BlockLogBase
{	
	public MythicWood(String name, Material material) 
	{
		super(name, material);
		setHardness(3.0F);
		setResistance(30.0F);
		setHarvestLevel("axe", 2);
		setLightLevel(0.6F);
		//setLightOpacity(1);
		//setBlockUnkreakable();
	}
}
