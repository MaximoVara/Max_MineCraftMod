package com.WolfpackDragon.maxores.blocks;

import java.util.Random;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CorundumOre extends BlockBase 
{
	
	public CorundumOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.6F);
		//setLightOpacity(1);
		//setBlockUnkreakable();
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int max = 6;
		int typeDropped = rand.nextInt(max);
		Item returnType = ModItems.CORUNDUM;
		if(typeDropped == 0) {
			returnType = ModItems.MYTHRIL_RAW;
		}
		return returnType;
	}
	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
}
