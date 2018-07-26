package com.cibernet.tutorialmod;

import com.cibernet.tutorialmod.init.ModRecipes;
import com.cibernet.tutorialmod.proxy.CommonProxy;
import com.cibernet.tutorialmod.tabs.TutorialTab;
import com.cibernet.tutorialmod.util.reference;
import com.cibernet.tutorialmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class Main {

	public static final CreativeTabs TUTORIAL = new TutorialTab("tutorialtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
}
