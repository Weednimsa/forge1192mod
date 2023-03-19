package net.weednimsa.pap.items;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.weednimsa.pap.Pap;
import net.weednimsa.pap.block.PapBlocks;
import net.weednimsa.pap.items.custom.coinitem;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Pap.MOD_ID);

    public static final RegistryObject<Item> ENDERIUM = ITEMS.register("enderium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Pap_Tab).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Pap_Tab).fireResistant()));
    public static final RegistryObject<Item> ENDERIUM_SWORD = ITEMS.register("enderium_sword", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Pap_Tab).fireResistant().stacksTo(1).durability(500)));

    public static final RegistryObject<Item> COIN = ITEMS.register("coin", () -> new coinitem(new Item.Properties().tab(ModCreativeModeTab.Pap_Tab).stacksTo(1)));

    public static void register(IEventBus eventBus)
     {
         ITEMS.register(eventBus);

     }

}
