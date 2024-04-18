package net.wondiws98.soulstuff.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wondiws98.soulstuff.SoulStuffMain;

public class SoulStuffBlocks {

    // BUILDING BLOCKS
        // GLASS
    public static final Block SOUL_GLASS = registerBlock("soul_glass", new TransparentBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block TINTED_SOUL_GLASS = registerBlock("tinted_soul_glass", new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS)));
    public static final Block SOUL_GLASS_PANE = registerBlock("soul_glass_pane", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE)));
        // STONE
            // ROUGH
    public static final Block SOUL_STONE = registerBlock("soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SOUL_STONE_SLAB = registerBlock("soul_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block SOUL_STONE_STAIRS = registerBlock("soul_stone_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block SOUL_STONE_WALL = registerBlock("soul_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
            // BRICKS
    public static final Block SOUL_STONE_BRICKS = registerBlock("soul_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SOUL_STONE_BRICK_SLAB = registerBlock("soul_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block SOUL_STONE_BRICK_STAIRS = registerBlock("soul_stone_brick_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block SOUL_STONE_BRICK_WALL = registerBlock("soul_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
            // POLISHED
    public static final Block POLISHED_SOUL_STONE = registerBlock("polished_soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block POLISHED_SOUL_STONE_SLAB = registerBlock("polished_soul_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block POLISHED_SOUL_STONE_STAIRS = registerBlock("polished_soul_stone_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block POLISHED_SOUL_STONE_WALL = registerBlock("polished_soul_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block POLISHED_SOUL_STONE_BUTTON = registerBlock("polished_soul_stone_button", Blocks.createStoneButtonBlock());
    public static final Block POLISHED_SOUL_STONE_PRESSURE_PLATE = registerBlock("polished_soul_stone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block CHISELED_SOUL_STONE = registerBlock("chiseled_soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
        // DARK STONE
            // ROUGH
    public static final Block DARK_SOUL_STONE = registerBlock("dark_soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block DARK_SOUL_STONE_SLAB = registerBlock("dark_soul_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block DARK_SOUL_STONE_STAIRS = registerBlock("dark_soul_stone_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block DARK_SOUL_STONE_WALL = registerBlock("dark_soul_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
            // BRICKS
    public static final Block DARK_SOUL_STONE_BRICKS = registerBlock("dark_soul_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block DARK_SOUL_STONE_BRICK_SLAB = registerBlock("dark_soul_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block DARK_SOUL_STONE_BRICK_STAIRS = registerBlock("dark_soul_stone_brick_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block DARK_SOUL_STONE_BRICK_WALL = registerBlock("dark_soul_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
            // POLISHED
    public static final Block POLISHED_DARK_SOUL_STONE = registerBlock("polished_dark_soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block POLISHED_DARK_SOUL_STONE_SLAB = registerBlock("polished_dark_soul_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block POLISHED_DARK_SOUL_STONE_STAIRS = registerBlock("polished_dark_soul_stone_stairs", new StairsBlock(Blocks.COBBLESTONE_STAIRS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block POLISHED_DARK_SOUL_STONE_WALL = registerBlock("polished_dark_soul_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block POLISHED_DARK_SOUL_STONE_BUTTON = registerBlock("polished_dark_soul_stone_button", Blocks.createStoneButtonBlock());
    public static final Block POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE = registerBlock("polished_dark_soul_stone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block CHISELED_DARK_SOUL_STONE = registerBlock("chiseled_dark_soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    // LIGHT
    public static final Block SOULLIGHT = registerBlock("soullight", new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(12)));
    public static final Block NICK_O_LANTERN = registerBlock("nick_o_lantern", new CarvedPumpkinBlock(FabricBlockSettings.copyOf(Blocks.JACK_O_LANTERN).luminance(12)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                new Identifier(SoulStuffMain.MOD_ID, name),
                block
        );
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(SoulStuffMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings())
        );
    }

    public static void registerSoulStuffBlocks() {
    }
}
