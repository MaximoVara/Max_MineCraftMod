package com.WolfpackDragon.maxores.items.tools;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.util.BaseModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements BaseModel{
	
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(null); 
		setCreativeTab(Main.MAXORE);
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModls() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}