package com.cibernet.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.cibernet.tutorialmod.items.ItemBase;
import com.cibernet.tutorialmod.items.ItemEggThing;
import com.cibernet.tutorialmod.items.armor.ArmorBase;
import com.cibernet.tutorialmod.items.tools.ToolAxe;
import com.cibernet.tutorialmod.items.tools.ToolGauntlets;
import com.cibernet.tutorialmod.items.tools.ToolHoe;
import com.cibernet.tutorialmod.items.tools.ToolPickaxe;
import com.cibernet.tutorialmod.items.tools.ToolSpade;
import com.cibernet.tutorialmod.items.tools.ToolSword;
import com.cibernet.tutorialmod.util.reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 4, 1000, 7.0F, 5.0F, 30);
	public static final ToolMaterial MATERIAL_FLUORITE = EnumHelper.addToolMaterial("material_fluorite", 2, 500, 5.0F, 8.0F, 15);
	
	
	public static final ArmorMaterial ARMOR_MATERIAL_SLIME = EnumHelper.addArmorMaterial("armor_material_slime", reference.MOD_ID + ":slime", 11, 
			new int[] {3,4,3,4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	public static final Item EGG_THING = new ItemEggThing("egg_thing");
	
	public static final Item FLUORITE = new ItemBase("fluorite");
	
	//Weapons
	public static final Item FLUORITE_GAUNTLET = new ToolGauntlets("fluorite_gauntlet", 8.0F, 1.5F, MATERIAL_FLUORITE);
	public static final Item FLUORITE_OCTET = new ItemBase("fluorite_octet");
	
	//Tools
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	
	//Armor
	public static final Item SLIME_HELMET = new ArmorBase("slime_helmet", ARMOR_MATERIAL_SLIME, 1, EntityEquipmentSlot.HEAD);
	public static final Item SLIME_CHESTPLATE = new ArmorBase("slime_chestplate", ARMOR_MATERIAL_SLIME, 1, EntityEquipmentSlot.CHEST);
	public static final Item SLIME_LEGGINGS = new ArmorBase("slime_leggings", ARMOR_MATERIAL_SLIME, 2, EntityEquipmentSlot.LEGS);
	public static final Item SLIME_BOOTS = new ArmorBase("slime_boots", ARMOR_MATERIAL_SLIME, 1, EntityEquipmentSlot.FEET);
	
}
