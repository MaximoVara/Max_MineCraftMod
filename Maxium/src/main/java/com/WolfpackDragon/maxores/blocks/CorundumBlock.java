package com.WolfpackDragon.maxores.blocks;

import com.WolfpackDragon.maxores.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CorundumBlock extends BlockBase 
{

	public CorundumBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.8F);
		//setLightOpacity(1);
		//setBlockUnkreakable();
		
	}
}
