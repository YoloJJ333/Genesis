package kingphoenix.genesis;

import kingphoenix.genesis.block.CustomBlocks;
import kingphoenix.genesis.item.CustomItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Genesis implements ModInitializer {
    public static final ItemGroup mythicalItems = FabricItemGroupBuilder.create(
                    new Identifier("genesis", "mythical_items"))
            .icon(() -> new ItemStack(Blocks.AIR))
            .build();
//    public static final Identifier TEST = new Identifier("genesis", "test");

    @Override
    public void onInitialize() {
        CustomItems.register();
        CustomBlocks.register();
//        Registry.register(Registry.CUSTOM_STAT, "test", TEST);
//        Stats.CUSTOM.getOrCreateStat(TEST, StatFormatter.DEFAULT);
    }
}
