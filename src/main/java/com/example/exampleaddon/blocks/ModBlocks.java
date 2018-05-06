package com.example.exampleaddon.blocks;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static Block exampleBlock = new Block(Material.CLAY).setRegistryName("example_block").setUnlocalizedName("exampleBlock").setCreativeTab(MinestuckItems.tabMinestuck);
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> registry = event.getRegistry();
		//blocks
		registry.register(exampleBlock);
	}

}
