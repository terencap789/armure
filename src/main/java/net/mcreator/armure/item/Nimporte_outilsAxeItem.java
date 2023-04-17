
package net.mcreator.armure.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.armure.init.ArmureModBlocks;

public class Nimporte_outilsAxeItem extends AxeItem {
	public Nimporte_outilsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 1000f;
			}

			public float getAttackDamageBonus() {
				return 998f;
			}

			public int getLevel() {
				return 1000;
			}

			public int getEnchantmentValue() {
				return 1000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ArmureModBlocks.NIMPORTEBLOCK.get()));
			}
		}, 1, 96f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
