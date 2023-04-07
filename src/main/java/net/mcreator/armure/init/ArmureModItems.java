
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.armure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.armure.item.NimportearmureItem;
import net.mcreator.armure.item.Nimporte_outilSwordItem;
import net.mcreator.armure.item.Nimporte_outilShovelItem;
import net.mcreator.armure.item.Nimporte_outilHoeItem;
import net.mcreator.armure.item.Nimporte_outilAxeItem;
import net.mcreator.armure.item.DiamantItem;
import net.mcreator.armure.ArmureMod;

public class ArmureModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArmureMod.MODID);
	public static final RegistryObject<Item> DIAMANT = REGISTRY.register("diamant", () -> new DiamantItem());
	public static final RegistryObject<Item> NIMPORTEBLOCK = block(ArmureModBlocks.NIMPORTEBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NIMPORTEARMURE_HELMET = REGISTRY.register("nimportearmure_helmet", () -> new NimportearmureItem.Helmet());
	public static final RegistryObject<Item> NIMPORTEARMURE_CHESTPLATE = REGISTRY.register("nimportearmure_chestplate", () -> new NimportearmureItem.Chestplate());
	public static final RegistryObject<Item> NIMPORTEARMURE_LEGGINGS = REGISTRY.register("nimportearmure_leggings", () -> new NimportearmureItem.Leggings());
	public static final RegistryObject<Item> NIMPORTEARMURE_BOOTS = REGISTRY.register("nimportearmure_boots", () -> new NimportearmureItem.Boots());
	public static final RegistryObject<Item> NIMPORTE_OUTIL_SWORD = REGISTRY.register("nimporte_outil_sword", () -> new Nimporte_outilSwordItem());
	public static final RegistryObject<Item> NIMPORTE_OUTIL_AXE = REGISTRY.register("nimporte_outil_axe", () -> new Nimporte_outilAxeItem());
	public static final RegistryObject<Item> NIMPORTE_OUTIL_SHOVEL = REGISTRY.register("nimporte_outil_shovel", () -> new Nimporte_outilShovelItem());
	public static final RegistryObject<Item> NIMPORTE_OUTIL_HOE = REGISTRY.register("nimporte_outil_hoe", () -> new Nimporte_outilHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
