package com.cibernet.tutorialmod.items.tools;

import java.util.Set;

import com.cibernet.tutorialmod.Main;
import com.cibernet.tutorialmod.init.ModItems;
import com.cibernet.tutorialmod.util.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolGauntlets extends ItemTool implements IHasModel {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.GLASS, Blocks.STAINED_GLASS,
			Blocks.GLASS_PANE, Blocks.STAINED_GLASS_PANE, Blocks.ICE, Blocks.PACKED_ICE, Blocks.WOODEN_BUTTON,
			Blocks.STONE_BUTTON);

	public ToolGauntlets(String name, float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn) {
		super(materialIn, EFFECTIVE_ON);
		this.attackDamage = attackDamageIn;
		this.attackSpeed = attackSpeedIn;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTORIAL);

		ModItems.ITEMS.add(this);

	}
	
	
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.GLASS && material != Material.ICE && material != Material.PACKED_ICE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }


	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
