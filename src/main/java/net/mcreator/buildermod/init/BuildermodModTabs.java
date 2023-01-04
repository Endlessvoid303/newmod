
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildermod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BuildermodModTabs {
	public static CreativeModeTab TAB_BUILDERSMODTAB;

	public static void load() {
		TAB_BUILDERSMODTAB = new CreativeModeTab("tabbuildersmodtab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BuildermodModItems.EMPTYBLUEPRINT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
