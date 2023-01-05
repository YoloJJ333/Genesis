package kingphoenix.genesis.item;

import kingphoenix.genesis.material.DragonToolMaterial;
import kingphoenix.genesis.Genesis;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class DragonSword extends SwordItem{

    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .group(ItemGroup.COMBAT)
            .maxCount(1)
            .fireproof();

    public DragonSword() {
        super(DragonToolMaterial.DRAGON_TOOL_MATERIAL, 0, -2.4F, settings);
    }
}
