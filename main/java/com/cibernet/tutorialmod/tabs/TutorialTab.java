package com.cibernet.tutorialmod.tabs;

import com.cibernet.tutorialmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs{

	public TutorialTab(String label) {
		super(label);
		this.setBackgroundImageName("tutorial.png");
	}

	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItems.FLUORITE);
	}

}
