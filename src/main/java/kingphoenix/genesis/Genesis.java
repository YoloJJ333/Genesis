package kingphoenix.genesis;

import kingphoenix.genesis.block.CustomBlocks;
import kingphoenix.genesis.item.CustomItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Genesis implements ModInitializer {
    public static final ItemGroup MYTHICAL_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier("genesis", "mythical_items"))
            .icon(() -> new ItemStack(Blocks.AIR))
            .build();

    @Override
    public void onInitialize() {
        CustomItems.register();
        CustomBlocks.register();
//        CustomSounds.register();
        CustomStats.register();
    }
}
