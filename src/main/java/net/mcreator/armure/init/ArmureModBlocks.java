
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.armure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.armure.block.NimporteblockBlock;
import net.mcreator.armure.block.DiamantPortalBlock;
import net.mcreator.armure.ArmureMod;

public class ArmureModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArmureMod.MODID);
	public static final RegistryObject<Block> DIAMANT_PORTAL = REGISTRY.register("diamant_portal", () -> new DiamantPortalBlock());
	public static final RegistryObject<Block> NIMPORTEBLOCK = REGISTRY.register("nimporteblock", () -> new NimporteblockBlock());
}
