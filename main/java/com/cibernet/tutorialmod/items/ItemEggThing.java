package com.cibernet.tutorialmod.items;

import com.cibernet.tutorialmod.Main;
import com.cibernet.tutorialmod.init.ModItems;
import com.cibernet.tutorialmod.tabs.TutorialTab;
import com.cibernet.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemEggThing extends Item implements IHasModel{

	public ItemEggThing(String name)
    {
		setUnlocalizedName(name);
		setRegistryName(name);
        this.maxStackSize = 16;
        this.setMaxDamage(10);
        
        ModItems.ITEMS.add(this);
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
    	//EntityPlayer user = playerIn;
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        
        
        
        if (!playerIn.capabilities.isCreativeMode)
        {
           // itemstack.shrink(1);
        	itemstack.damageItem(1, playerIn);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_COW_AMBIENT, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
            EntityEgg entityegg = new EntityEgg(worldIn, playerIn);
            entityegg.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 0.5F);
            worldIn.spawnEntity(entityegg);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
