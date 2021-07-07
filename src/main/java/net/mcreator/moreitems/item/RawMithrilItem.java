
package net.mcreator.moreitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.moreitems.DjfilmsmiModElements;

@DjfilmsmiModElements.ModElement.Tag
public class RawMithrilItem extends DjfilmsmiModElements.ModElement {
	@ObjectHolder("djfilmsmi:raw_mithril")
	public static final Item block = null;
	public RawMithrilItem(DjfilmsmiModElements instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("raw_mithril");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
