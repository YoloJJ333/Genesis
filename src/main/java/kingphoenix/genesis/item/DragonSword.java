package kingphoenix.genesis.item;

import kingphoenix.genesis.DragonToolMaterial;
import kingphoenix.genesis.Genesis;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Rarity;

public class DragonSword extends SwordItem{

    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .group(ItemGroup.COMBAT)
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.EPIC);

    public DragonSword() {
        super(DragonToolMaterial.INSTANCE, 0, -2.4F, settings);
    }
}
