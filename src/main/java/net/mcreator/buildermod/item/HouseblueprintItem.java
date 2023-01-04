
package net.mcreator.buildermod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.buildermod.init.BuildermodModTabs;

public class HouseblueprintItem extends Item {
	public HouseblueprintItem() {
		super(new Item.Properties().tab(BuildermodModTabs.TAB_BUILDERSMODTAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
