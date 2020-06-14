package com.WolfpackDragon.maxores.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MythicGemBlock extends BlockBase 
{
	public MythicGemBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.8F);
		//setLightOpacity(1);
		//setBlockUnkreakable();
	}
	
}
