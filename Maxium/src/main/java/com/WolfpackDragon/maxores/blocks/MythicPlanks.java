package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MythicPlanks extends BlockBase 
{
	
	public MythicPlanks(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(2.5F);
		setResistance(30.0F);
		setHarvestLevel("axe", 2);
		setLightLevel(0.8F);
		
		//setLightOpacity(1);
		//setBlockUnkreakable();
	}
	
}
