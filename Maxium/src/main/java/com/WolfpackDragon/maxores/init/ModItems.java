package com.WolfpackDragon.maxores.init;

import java.util.ArrayList;
import java.util.List;

import com.WolfpackDragon.maxores.items.ItemBase;
import com.WolfpackDragon.maxores.items.armor.ArmorBase;
import com.WolfpackDragon.maxores.items.tools.ToolAxe;
import com.WolfpackDragon.maxores.items.tools.ToolHoe;
import com.WolfpackDragon.maxores.items.tools.ToolPickaxe;
import com.WolfpackDragon.maxores.items.tools.ToolSpade;
import com.WolfpackDragon.maxores.items.tools.ToolSword;
import com.WolfpackDragon.maxores.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	//(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial MATERIAL_MYTHIC_WOOD = EnumHelper.addToolMaterial("material_mythic", 2, 375, 12.0F, 2.0F, 22); 
	public static final ToolMaterial MATERIAL_MYTHRIL = EnumHelper.addToolMaterial("material_mythril", 3, 625, 12.0F, 4.0F, 22);
	//public static final ArmorMaterial ARMOR_MATERIAL_MYTHIC_WOOD = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness);
	public static final ArmorMaterial ARMOR_MATERIAL_MYTHRIl = EnumHelper.addArmorMaterial("armor_material_mythril", Reference.MOD_ID + ":mythril", 25, new int[] {4, 7, 9, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0F);
	
	//Items
	//public static final Item MAXIUM = new ItemBase("maxium");
	public static final Item CORUNDUM = new ItemBase("corundum", 80);
	public static final Item MYTHRIL_RAW = new ItemBase("mythril_raw");
	public static final Item MYTHRIL_INGOT = new ItemBase("mythril_ingot");
	
	//Tools - Mythic
	public static final ItemSword MYTHIC_WOOD_SWORD = new ToolSword("mythic_sword", MATERIAL_MYTHIC_WOOD);
	public static final ItemSpade MYTHIC_WOOD_SHOVEL = new ToolSpade("mythic_spade", MATERIAL_MYTHIC_WOOD);
	public static final ItemAxe MYTHIC_WOOD_AXE = new ToolAxe("mythic_axe", MATERIAL_MYTHIC_WOOD);
	public static final ItemPickaxe MYTHIC_WOOD_PICKAXE = new ToolPickaxe("mythic_pickaxe", MATERIAL_MYTHIC_WOOD);
	public static final ItemHoe MYTHIC_WOOD_HOE = new ToolHoe("mythic_hoe", MATERIAL_MYTHIC_WOOD);
	
	//Tools - Mythril
	public static final ItemSword MYTHRIL_SWORD = new ToolSword("mythril_sword", MATERIAL_MYTHRIL);
	public static final ItemSpade MYTHRILSHOVEL = new ToolSpade("mythril_spade", MATERIAL_MYTHRIL);
	public static final ItemAxe MYTHRILAXE = new ToolAxe("mythril_axe", MATERIAL_MYTHRIL);
	public static final ItemPickaxe MYTHRILPICKAXE = new ToolPickaxe("mythril_pickaxe", MATERIAL_MYTHRIL);
	public static final ItemHoe MYTHRIL_HOE = new ToolHoe("mythril_hoe", MATERIAL_MYTHRIL);
	
	//Armor - Mythril
	public static final Item MYTHRIL_HELMET = new ArmorBase("mythril_helmet", ARMOR_MATERIAL_MYTHRIl, 1, EntityEquipmentSlot.HEAD);
	public static final Item MYTHRIL_CHESTPLATE = new ArmorBase("mythril_chestplate", ARMOR_MATERIAL_MYTHRIl, 1, EntityEquipmentSlot.CHEST);
	public static final Item MYTHRIL_LEGGINGS = new ArmorBase("mythril_leggings", ARMOR_MATERIAL_MYTHRIl, 2, EntityEquipmentSlot.LEGS);
	public static final Item MYTHRIL_BOOTS = new ArmorBase("mythril_boots", ARMOR_MATERIAL_MYTHRIl, 1, EntityEquipmentSlot.FEET);
	
}
