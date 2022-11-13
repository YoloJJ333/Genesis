package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class SoulCage {
    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.mythicalItems)
            .maxCount(1)
            .fireproof();


}
