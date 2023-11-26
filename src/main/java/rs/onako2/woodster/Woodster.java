package rs.onako2.woodster;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChiseledBookshelfBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Woodster implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("woodster");

	// Chiseled Bookshelfs
	public static final Block SPRUCE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block BIRCH_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block JUNGLE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block ACACIA_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block DARK_OAK_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block MANGROVE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.RED).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block CHERRY_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block BAMBOO_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.YELLOW).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block CRIMSON_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());
	public static final Block WARPED_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(
			FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.CHISELED_BOOKSHELF).burnable());

	// Bookshelfs
	public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.RED)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block CHERRY_BOOKSHELF = new Block(
			FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASS).strength(1.5F)
					.sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block BAMBOO_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.YELLOW)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD).burnable());
	public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA)
			.instrument(Instrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOD));

	// Ladders

	public static final Block SPRUCE_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block BIRCH_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block JUNGLE_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block ACACIA_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block DARK_OAK_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block MANGROVE_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block CHERRY_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block BAMBOO_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).burnable().nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block CRIMSON_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	public static final Block WARPED_LADDER = new LadderBlock(FabricBlockSettings.create().notSolid().strength(0.4F)
			.sounds(BlockSoundGroup.LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));

	private static final ItemGroup WOODSER_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(CHERRY_CHISELED_BOOKSHELF))
			.displayName(Text.translatable("itemGroup.woodster"))
			.entries((context, entries) -> {
				entries.add(Blocks.BOOKSHELF);
				entries.add(Blocks.CHISELED_BOOKSHELF);
				entries.add(Blocks.LADDER);

				entries.add(SPRUCE_BOOKSHELF);
				entries.add(SPRUCE_CHISELED_BOOKSHELF);
				entries.add(SPRUCE_LADDER);

				entries.add(BIRCH_BOOKSHELF);
				entries.add(BIRCH_CHISELED_BOOKSHELF);
				entries.add(BIRCH_LADDER);

				entries.add(JUNGLE_BOOKSHELF);
				entries.add(JUNGLE_CHISELED_BOOKSHELF);
				entries.add(JUNGLE_LADDER);

				entries.add(ACACIA_BOOKSHELF);
				entries.add(ACACIA_CHISELED_BOOKSHELF);
				entries.add(ACACIA_LADDER);

				entries.add(DARK_OAK_BOOKSHELF);
				entries.add(DARK_OAK_CHISELED_BOOKSHELF);
				entries.add(DARK_OAK_LADDER);

				entries.add(MANGROVE_BOOKSHELF);
				entries.add(MANGROVE_CHISELED_BOOKSHELF);
				entries.add(MANGROVE_LADDER);

				entries.add(CRIMSON_BOOKSHELF);
				entries.add(CRIMSON_CHISELED_BOOKSHELF);
				entries.add(CRIMSON_LADDER);

				entries.add(WARPED_BOOKSHELF);
				entries.add(WARPED_CHISELED_BOOKSHELF);
				entries.add(WARPED_LADDER);
			})
			.build();

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Quilt world!");

		Registry.register(Registries.ITEM_GROUP, new Identifier("woodster", "itemgroup"), WOODSER_ITEM_GROUP);

		// Chiseled Bookshelfs

		// blocks
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
		Registry.register(Registries.BLOCK, new Identifier("woodster", "crimson_chiseled_bookshelf"),
				CRIMSON_CHISELED_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "warped_chiseled_bookshelf"),
				WARPED_CHISELED_BOOKSHELF);

		// items
		Registry.register(Registries.ITEM, new Identifier("woodster", "spruce_chiseled_bookshelf"),
				new BlockItem(SPRUCE_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "birch_chiseled_bookshelf"),
				new BlockItem(BIRCH_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "jungle_chiseled_bookshelf"),
				new BlockItem(JUNGLE_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "acacia_chiseled_bookshelf"),
				new BlockItem(ACACIA_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "dark_oak_chiseled_bookshelf"),
				new BlockItem(DARK_OAK_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "mangrove_chiseled_bookshelf"),
				new BlockItem(MANGROVE_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "cherry_chiseled_bookshelf"),
				new BlockItem(CHERRY_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "bamboo_chiseled_bookshelf"),
				new BlockItem(BAMBOO_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "crimson_chiseled_bookshelf"),
				new BlockItem(CRIMSON_CHISELED_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "warped_chiseled_bookshelf"),
				new BlockItem(WARPED_CHISELED_BOOKSHELF, new FabricItemSettings()));

		// bookshelf

		// blocks
		Registry.register(Registries.BLOCK, new Identifier("woodster", "spruce_bookshelf"),
				SPRUCE_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "birch_bookshelf"),
				BIRCH_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "jungle_bookshelf"),
				JUNGLE_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "acacia_bookshelf"),
				ACACIA_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "dark_oak_bookshelf"),
				DARK_OAK_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "mangrove_bookshelf"),
				MANGROVE_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "cherry_bookshelf"),
				CHERRY_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "bamboo_bookshelf"),
				BAMBOO_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "crimson_bookshelf"),
				CRIMSON_BOOKSHELF);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "warped_bookshelf"),
				WARPED_BOOKSHELF);

		// items
		Registry.register(Registries.ITEM, new Identifier("woodster", "spruce_bookshelf"),
				new BlockItem(SPRUCE_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "birch_bookshelf"),
				new BlockItem(BIRCH_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "jungle_bookshelf"),
				new BlockItem(JUNGLE_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "acacia_bookshelf"),
				new BlockItem(ACACIA_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "dark_oak_bookshelf"),
				new BlockItem(DARK_OAK_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "mangrove_bookshelf"),
				new BlockItem(MANGROVE_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "cherry_bookshelf"),
				new BlockItem(CHERRY_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "bamboo_bookshelf"),
				new BlockItem(BAMBOO_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "crimson_bookshelf"),
				new BlockItem(CRIMSON_BOOKSHELF, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "warped_bookshelf"),
				new BlockItem(WARPED_BOOKSHELF, new FabricItemSettings()));

		// Ladder

		// Block
		Registry.register(Registries.BLOCK, new Identifier("woodster", "spruce_ladder"),
				SPRUCE_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "birch_ladder"),
				BIRCH_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "jungle_ladder"),
				JUNGLE_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "acacia_ladder"),
				ACACIA_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "dark_oak_ladder"),
				DARK_OAK_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "mangrove_ladder"),
				MANGROVE_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "cherry_ladder"),
				CHERRY_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "bamboo_ladder"),
				BAMBOO_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "crimson_ladder"),
				CRIMSON_LADDER);
		Registry.register(Registries.BLOCK, new Identifier("woodster", "warped_ladder"),
				WARPED_LADDER);

		// items
		Registry.register(Registries.ITEM, new Identifier("woodster", "spruce_ladder"),
				new BlockItem(SPRUCE_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "birch_ladder"),
				new BlockItem(BIRCH_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "jungle_ladder"),
				new BlockItem(JUNGLE_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "acacia_ladder"),
				new BlockItem(ACACIA_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "dark_oak_ladder"),
				new BlockItem(DARK_OAK_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "mangrove_ladder"),
				new BlockItem(MANGROVE_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "cherry_ladder"),
				new BlockItem(CHERRY_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "bamboo_ladder"),
				new BlockItem(BAMBOO_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "crimson_ladder"),
				new BlockItem(CRIMSON_LADDER, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("woodster", "warped_ladder"),
				new BlockItem(WARPED_LADDER, new FabricItemSettings()));

	}
}