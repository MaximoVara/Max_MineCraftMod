package com.WolfpackDragon.maxores.items.armor;

import com.WolfpackDragon.maxores.Main;
import com.WolfpackDragon.maxores.init.ModItems;
import com.WolfpackDragon.maxores.util.BaseModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements BaseModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
