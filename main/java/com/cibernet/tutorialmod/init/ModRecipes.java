package com.cibernet.tutorialmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.FLUORITE_ORE, new ItemStack(ModItems.FLUORITE,3), 10f);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.EGG_THING,1),0.5f);
	}
	
	
}
