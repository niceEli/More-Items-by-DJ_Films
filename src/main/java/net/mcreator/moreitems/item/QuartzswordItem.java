
package net.mcreator.moreitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreitems.DjfilmsmiModElements;

@DjfilmsmiModElements.ModElement.Tag
public class QuartzswordItem extends DjfilmsmiModElements.ModElement {
	@ObjectHolder("djfilmsmi:quartzsword")
	public static final Item block = null;
	public QuartzswordItem(DjfilmsmiModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(QuartzswordItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("quartzsword"));
	}
}
