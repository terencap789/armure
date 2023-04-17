
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.armure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.armure.block.PierreWoodBlock;
import net.mcreator.armure.block.PierreStairsBlock;
import net.mcreator.armure.block.PierreSlabBlock;
import net.mcreator.armure.block.PierrePressurePlateBlock;
import net.mcreator.armure.block.PierrePlanksBlock;
import net.mcreator.armure.block.PierreLogBlock;
import net.mcreator.armure.block.PierreLeavesBlock;
import net.mcreator.armure.block.PierreFenceGateBlock;
import net.mcreator.armure.block.PierreFenceBlock;
import net.mcreator.armure.block.PierreButtonBlock;
import net.mcreator.armure.block.NulleOreBlock;
import net.mcreator.armure.block.NulleBlockBlock;
import net.mcreator.armure.block.NoireOreBlock;
import net.mcreator.armure.block.NoireBlockBlock;
import net.mcreator.armure.block.NimporteblockBlock;
import net.mcreator.armure.block.DiamantPortalBlock;
import net.mcreator.armure.block.CasandraWoodBlock;
import net.mcreator.armure.block.CasandraStairsBlock;
import net.mcreator.armure.block.CasandraSlabBlock;
import net.mcreator.armure.block.CasandraPressurePlateBlock;
import net.mcreator.armure.block.CasandraPlanksBlock;
import net.mcreator.armure.block.CasandraLogBlock;
import net.mcreator.armure.block.CasandraLeavesBlock;
import net.mcreator.armure.block.CasandraFenceGateBlock;
import net.mcreator.armure.block.CasandraFenceBlock;
import net.mcreator.armure.block.CasandraButtonBlock;
import net.mcreator.armure.block.Caca_boisWoodBlock;
import net.mcreator.armure.block.Caca_boisStairsBlock;
import net.mcreator.armure.block.Caca_boisSlabBlock;
import net.mcreator.armure.block.Caca_boisPressurePlateBlock;
import net.mcreator.armure.block.Caca_boisPlanksBlock;
import net.mcreator.armure.block.Caca_boisLogBlock;
import net.mcreator.armure.block.Caca_boisLeavesBlock;
import net.mcreator.armure.block.Caca_boisFenceGateBlock;
import net.mcreator.armure.block.Caca_boisFenceBlock;
import net.mcreator.armure.block.Caca_boisButtonBlock;
import net.mcreator.armure.block.CacaOreBlock;
import net.mcreator.armure.block.CacaBlockBlock;
import net.mcreator.armure.block.BlockcacaBlock;
import net.mcreator.armure.ArmureMod;

public class ArmureModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArmureMod.MODID);
	public static final RegistryObject<Block> DIAMANT_PORTAL = REGISTRY.register("diamant_portal", () -> new DiamantPortalBlock());
	public static final RegistryObject<Block> NIMPORTEBLOCK = REGISTRY.register("nimporteblock", () -> new NimporteblockBlock());
	public static final RegistryObject<Block> BLOCKCACA = REGISTRY.register("blockcaca", () -> new BlockcacaBlock());
	public static final RegistryObject<Block> CACA_ORE = REGISTRY.register("caca_ore", () -> new CacaOreBlock());
	public static final RegistryObject<Block> CACA_BLOCK = REGISTRY.register("caca_block", () -> new CacaBlockBlock());
	public static final RegistryObject<Block> CASANDRA_WOOD = REGISTRY.register("casandra_wood", () -> new CasandraWoodBlock());
	public static final RegistryObject<Block> CASANDRA_LOG = REGISTRY.register("casandra_log", () -> new CasandraLogBlock());
	public static final RegistryObject<Block> CASANDRA_PLANKS = REGISTRY.register("casandra_planks", () -> new CasandraPlanksBlock());
	public static final RegistryObject<Block> CASANDRA_LEAVES = REGISTRY.register("casandra_leaves", () -> new CasandraLeavesBlock());
	public static final RegistryObject<Block> CASANDRA_STAIRS = REGISTRY.register("casandra_stairs", () -> new CasandraStairsBlock());
	public static final RegistryObject<Block> CASANDRA_SLAB = REGISTRY.register("casandra_slab", () -> new CasandraSlabBlock());
	public static final RegistryObject<Block> CASANDRA_FENCE = REGISTRY.register("casandra_fence", () -> new CasandraFenceBlock());
	public static final RegistryObject<Block> CASANDRA_FENCE_GATE = REGISTRY.register("casandra_fence_gate", () -> new CasandraFenceGateBlock());
	public static final RegistryObject<Block> CASANDRA_PRESSURE_PLATE = REGISTRY.register("casandra_pressure_plate", () -> new CasandraPressurePlateBlock());
	public static final RegistryObject<Block> CASANDRA_BUTTON = REGISTRY.register("casandra_button", () -> new CasandraButtonBlock());
	public static final RegistryObject<Block> CACA_BOIS_WOOD = REGISTRY.register("caca_bois_wood", () -> new Caca_boisWoodBlock());
	public static final RegistryObject<Block> CACA_BOIS_LOG = REGISTRY.register("caca_bois_log", () -> new Caca_boisLogBlock());
	public static final RegistryObject<Block> CACA_BOIS_PLANKS = REGISTRY.register("caca_bois_planks", () -> new Caca_boisPlanksBlock());
	public static final RegistryObject<Block> CACA_BOIS_LEAVES = REGISTRY.register("caca_bois_leaves", () -> new Caca_boisLeavesBlock());
	public static final RegistryObject<Block> CACA_BOIS_STAIRS = REGISTRY.register("caca_bois_stairs", () -> new Caca_boisStairsBlock());
	public static final RegistryObject<Block> CACA_BOIS_SLAB = REGISTRY.register("caca_bois_slab", () -> new Caca_boisSlabBlock());
	public static final RegistryObject<Block> CACA_BOIS_FENCE = REGISTRY.register("caca_bois_fence", () -> new Caca_boisFenceBlock());
	public static final RegistryObject<Block> CACA_BOIS_FENCE_GATE = REGISTRY.register("caca_bois_fence_gate", () -> new Caca_boisFenceGateBlock());
	public static final RegistryObject<Block> CACA_BOIS_PRESSURE_PLATE = REGISTRY.register("caca_bois_pressure_plate", () -> new Caca_boisPressurePlateBlock());
	public static final RegistryObject<Block> CACA_BOIS_BUTTON = REGISTRY.register("caca_bois_button", () -> new Caca_boisButtonBlock());
	public static final RegistryObject<Block> PIERRE_WOOD = REGISTRY.register("pierre_wood", () -> new PierreWoodBlock());
	public static final RegistryObject<Block> PIERRE_LOG = REGISTRY.register("pierre_log", () -> new PierreLogBlock());
	public static final RegistryObject<Block> PIERRE_PLANKS = REGISTRY.register("pierre_planks", () -> new PierrePlanksBlock());
	public static final RegistryObject<Block> PIERRE_LEAVES = REGISTRY.register("pierre_leaves", () -> new PierreLeavesBlock());
	public static final RegistryObject<Block> PIERRE_STAIRS = REGISTRY.register("pierre_stairs", () -> new PierreStairsBlock());
	public static final RegistryObject<Block> PIERRE_SLAB = REGISTRY.register("pierre_slab", () -> new PierreSlabBlock());
	public static final RegistryObject<Block> PIERRE_FENCE = REGISTRY.register("pierre_fence", () -> new PierreFenceBlock());
	public static final RegistryObject<Block> PIERRE_FENCE_GATE = REGISTRY.register("pierre_fence_gate", () -> new PierreFenceGateBlock());
	public static final RegistryObject<Block> PIERRE_PRESSURE_PLATE = REGISTRY.register("pierre_pressure_plate", () -> new PierrePressurePlateBlock());
	public static final RegistryObject<Block> PIERRE_BUTTON = REGISTRY.register("pierre_button", () -> new PierreButtonBlock());
	public static final RegistryObject<Block> NULLE_ORE = REGISTRY.register("nulle_ore", () -> new NulleOreBlock());
	public static final RegistryObject<Block> NULLE_BLOCK = REGISTRY.register("nulle_block", () -> new NulleBlockBlock());
	public static final RegistryObject<Block> NOIRE_ORE = REGISTRY.register("noire_ore", () -> new NoireOreBlock());
	public static final RegistryObject<Block> NOIRE_BLOCK = REGISTRY.register("noire_block", () -> new NoireBlockBlock());
}
