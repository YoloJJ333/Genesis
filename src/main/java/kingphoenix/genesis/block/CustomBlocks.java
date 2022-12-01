package kingphoenix.genesis.block;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlocks {

    public static final Block moist_carpet = new MoistCarpet();
    public static final Block mono_wall = new MonoWall();
    public static final Block old_ceiling = new OldCeiling();
    public static final Block fluorescent_light = new FluorescentLight();


    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("genesis", "moist_carpet"), moist_carpet);
        Registry.register(Registry.ITEM, new Identifier("genesis", "moist_carpet"), new BlockItem(moist_carpet, new FabricItemSettings().group(Genesis.mythicalItems)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "mono_wall"), mono_wall);
        Registry.register(Registry.ITEM, new Identifier("genesis", "mono_wall"), new BlockItem(mono_wall, new FabricItemSettings().group(Genesis.mythicalItems)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "old_ceiling"), old_ceiling);
        Registry.register(Registry.ITEM, new Identifier("genesis", "old_ceiling"), new BlockItem(old_ceiling, new FabricItemSettings().group(Genesis.mythicalItems)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "fluorescent_light"), fluorescent_light);
        Registry.register(Registry.ITEM, new Identifier("genesis", "fluorescent_light"), new BlockItem(fluorescent_light, new FabricItemSettings().group(Genesis.mythicalItems)));
    }

}
