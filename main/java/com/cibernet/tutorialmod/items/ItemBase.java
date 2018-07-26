package com.cibernet.tutorialmod.items;

import com.cibernet.tutorialmod.Main;
import com.cibernet.tutorialmod.init.ModItems;
import com.cibernet.tutorialmod.tabs.TutorialTab;
import com.cibernet.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
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
