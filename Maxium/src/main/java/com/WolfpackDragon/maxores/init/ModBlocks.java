package com.WolfpackDragon.maxores.init;

import java.util.ArrayList;
import java.util.List;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.blocks.BlockBase;
import com.WolfpackDragon.maxores.blocks.BlockFenceBase;
import com.WolfpackDragon.maxores.blocks.BlockLogBase;
import com.WolfpackDragon.maxores.blocks.BlockStairsBase;
import com.WolfpackDragon.maxores.blocks.CorundumBlock;
import com.WolfpackDragon.maxores.blocks.CorundumOre;
import com.WolfpackDragon.maxores.blocks.MythicGemBlock;
import com.WolfpackDragon.maxores.blocks.MythicPlanks;
import com.WolfpackDragon.maxores.blocks.MythicWood;
import com.WolfpackDragon.maxores.blocks.MythrilBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//public static final Block MAXIUM_BLOCK = new BlockBase("maxium_block", Material.IRON);
	
	public static final Block LOG_MYTHIC = new MythicWood("log_mythic", Material.WOOD);
	public static final Block PLANKS_MYTHIC = new MythicPlanks("planks_mythic", Material.WOOD);
	
	public static final Block CORUNDUM_ORE = new CorundumOre("corundum_ore", Material.ROCK);
	public static final Block CORUNDUM_BLOCK = new CorundumBlock("corundum_block", Material.GROUND);
	public static final Block MYTHIC_GEM_BLOCK = new MythicGemBlock("mythic_gem_block", Material.IRON);
	public static final Block MYTHRIL_BLOCK = new MythrilBlock("mythril_block", Material.IRON);
	
	//Stairs
	public static final BlockStairs MYTHIC_WOOD_STAIRS = new BlockStairsBase("mythic_wood_stairs", LOG_MYTHIC.getDefaultState());
	public static final BlockStairs CORUNDUM_STAIRS = new BlockStairsBase("corundum_stairs", CORUNDUM_BLOCK.getDefaultState());
	public static final BlockStairs MYTHIC_GEM_STAIRS = new BlockStairsBase("mythic_gem_stairs", MYTHIC_GEM_BLOCK.getDefaultState());
	public static final BlockStairs MYTHRIL_STAIRS = new BlockStairsBase("mythril_stairs", MYTHRIL_BLOCK.getDefaultState());
}
