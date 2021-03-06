
package net.mcreator.moreitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreitems.DjfilmsmiModElements;

@DjfilmsmiModElements.ModElement.Tag
public class CopperpicaxeItem extends DjfilmsmiModElements.ModElement {
	@ObjectHolder("djfilmsmi:copperpicaxe")
	public static final Item block = null;
	public CopperpicaxeItem(DjfilmsmiModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 102;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 2.199999999999999f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperpicaxeItem.block, (int) (1)));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("copperpicaxe"));
	}
}
