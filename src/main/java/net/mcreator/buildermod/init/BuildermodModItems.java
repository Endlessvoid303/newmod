
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.buildermod.item.HouseblueprintItem;
import net.mcreator.buildermod.item.EmptyblueprintItem;
import net.mcreator.buildermod.BuildermodMod;

public class BuildermodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BuildermodMod.MODID);
	public static final RegistryObject<Item> EMPTYBLUEPRINT = REGISTRY.register("emptyblueprint", () -> new EmptyblueprintItem());
	public static final RegistryObject<Item> HOUSEBLUEPRINT = REGISTRY.register("houseblueprint", () -> new HouseblueprintItem());
}
