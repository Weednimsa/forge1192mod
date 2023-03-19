package net.weednimsa.pap.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.weednimsa.pap.Pap;
import net.weednimsa.pap.block.PapBlocks;

import java.util.List;
import java.util.function.Supplier;

;


public class ModConfiguredFeatures
{
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Pap.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ENDERIUM_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), PapBlocks.ENDERIUM_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?,?>> ENDERIUM_ORE = CONFIGURED_FEATURES.register("enderium_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ENDERIUM_ORE.get(),50)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);

    }
}
