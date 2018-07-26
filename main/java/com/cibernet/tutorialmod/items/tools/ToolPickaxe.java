package com.cibernet.tutorialmod.items.tools;

import com.cibernet.tutorialmod.Main;
import com.cibernet.tutorialmod.init.ModItems;
import com.cibernet.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	public ToolPickaxe (String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTORIAL);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
