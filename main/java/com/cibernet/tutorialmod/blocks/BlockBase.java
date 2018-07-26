package com.cibernet.tutorialmod.blocks;

import com.cibernet.tutorialmod.Main;
import com.cibernet.tutorialmod.init.ModBlocks;
import com.cibernet.tutorialmod.init.ModItems;
import com.cibernet.tutorialmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material)
	{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.TUTORIAL);

			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			ModBlocks.BLOCKS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
