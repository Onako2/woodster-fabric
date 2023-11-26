package rs.onako2.woodster;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ChiseledBookshelfBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Woodster implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("woodster");

	// Chiseled Bookshelfs
	public static final Block SPRUCE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block BIRCH_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block JUNGLE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block ACACIA_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block DARK_OAK_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block MANGROVE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block CHERRY_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block BAMBOO_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block CRIMSON_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());
	public static final Block WARPED_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Quilt world!");

		// Chiseled Bookshelfs
		Registry.register(Registries.BLOCK, new Identifier("woodster", "spruce_chiseled_bookshelf"),
				SPRUCE_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "birch_chiseled_bookshelf"),
				BIRCH_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "jungle_chiseled_bookshelf"),
				JUNGLE_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "acacia_chiseled_bookshelf"),
				ACACIA_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "dark_oak_chiseled_bookshelf"),
				DARK_OAK_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "mangrove_chiseled_bookshelf"),
				MANGROVE_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "cherry_chiseled_bookshelf"),
				CHERRY_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "bamboo_chiseled_bookshelf"),
				BAMBOO_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "crismon_chiseled_bookshelf"),
				CRIMSON_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "warped_chiseled_bookshelf"),
				WARPED_CHISELED_BOOKSHELF);

		Registry.register(Registries.ITEM, new Identifier("woodster", "spruce_chiseled_bookshelf"),
				new BlockItem(SPRUCE_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "birch_chiseled_bookshelf"),
				new BlockItem(BIRCH_CHISELED_BOOKSHELF, new FabricItemSettings()));
	}
}