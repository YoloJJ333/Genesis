package kingphoenix.genesis.block;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlocks {

    public static final Block moist_carpet = new MoistCarpet();

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("genesis", "moist_carpet"), moist_carpet);
        Registry.register(Registry.ITEM, new Identifier("genesis", "moist_carpet"), new BlockItem(moist_carpet, new FabricItemSettings().group(Genesis.mythicalItems)));
    }
}
