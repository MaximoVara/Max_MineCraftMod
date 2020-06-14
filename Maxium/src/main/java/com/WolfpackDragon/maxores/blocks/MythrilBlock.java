package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MythrilBlock extends BlockBase 
{
	public MythrilBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.8F);
		//setLightOpacity(1);
		//setBlockUnkreakable();
	}
	
}
