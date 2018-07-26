package com.cibernet.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOres extends BlockBase{
	public BlockOres(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe",1);
		//setLightLevel(15.0f);
		//setLightOpacity(0);
		//setBlockUnbreakable();

	}
}
