package net.weednimsa.pap.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.weednimsa.pap.Pap;
import net.weednimsa.pap.items.ModCreativeModeTab;
import net.weednimsa.pap.items.ModItems;

import java.util.function.Supplier;



public class PapBlocks
{
    public static final DeferredRegister <Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Pap.MOD_ID);

    public static final RegistryObject<Block> ENDERIUM_BLOCK = registerBlock("enderium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops().explosionResistance(100)), ModCreativeModeTab.Pap_Tab);
    public static final RegistryObject<Block> ENDERIUM_ORE = registerBlock("enderium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops().explosionResistance(100)), ModCreativeModeTab.Pap_Tab);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void  register(IEventBus eventBus)
    {
     BLOCKS.register(eventBus);
    }
}
