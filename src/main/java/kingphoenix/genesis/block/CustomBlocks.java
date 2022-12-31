package kingphoenix.genesis.block;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlocks {

    public static final Block MOIST_CARPET = new MoistCarpet();
    public static final Block MONO_WALL = new MonoWall();
    public static final Block OLD_CEILING = new OldCeiling();
    public static final Block FLUORESCENT_LIGHT = new FluorescentLight();


    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("genesis", "moist_carpet"), MOIST_CARPET);
        Registry.register(Registry.ITEM, new Identifier("genesis", "moist_carpet"), new BlockItem(MOIST_CARPET, new FabricItemSettings().group(Genesis.MYTHICAL_ITEMS)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "mono_wall"), MONO_WALL);
        Registry.register(Registry.ITEM, new Identifier("genesis", "mono_wall"), new BlockItem(MONO_WALL, new FabricItemSettings().group(Genesis.MYTHICAL_ITEMS)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "old_ceiling"), OLD_CEILING);
        Registry.register(Registry.ITEM, new Identifier("genesis", "old_ceiling"), new BlockItem(OLD_CEILING, new FabricItemSettings().group(Genesis.MYTHICAL_ITEMS)));

        Registry.register(Registry.BLOCK, new Identifier("genesis", "fluorescent_light"), FLUORESCENT_LIGHT);
        Registry.register(Registry.ITEM, new Identifier("genesis", "fluorescent_light"), new BlockItem(FLUORESCENT_LIGHT, new FabricItemSettings().group(Genesis.MYTHICAL_ITEMS)));

    }

}
