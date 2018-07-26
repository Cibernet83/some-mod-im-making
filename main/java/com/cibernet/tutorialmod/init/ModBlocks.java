package com.cibernet.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.cibernet.tutorialmod.blocks.BlockBase;
import com.cibernet.tutorialmod.blocks.BlockOres;
import com.cibernet.tutorialmod.blocks.FluoriteBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FLUORITE_BLOCK = new FluoriteBlock("fluorite_block", Material.IRON);
	
	public static final Block FLUORITE_ORE = new BlockOres("fluorite_ore", Material.ROCK);
	
	
}
