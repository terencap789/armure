
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.armure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.armure.world.features.ores.NulleOreFeature;
import net.mcreator.armure.world.features.ores.NoireOreFeature;
import net.mcreator.armure.world.features.ores.CacaOreFeature;
import net.mcreator.armure.ArmureMod;

@Mod.EventBusSubscriber
public class ArmureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ArmureMod.MODID);
	public static final RegistryObject<Feature<?>> CACA_ORE = REGISTRY.register("caca_ore", CacaOreFeature::feature);
	public static final RegistryObject<Feature<?>> NULLE_ORE = REGISTRY.register("nulle_ore", NulleOreFeature::feature);
	public static final RegistryObject<Feature<?>> NOIRE_ORE = REGISTRY.register("noire_ore", NoireOreFeature::feature);
}
