package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class SoulCage extends Item {
    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.mythicalItems)
            .maxCount(1)
            .fireproof();

    public SoulCage() {
        super(settings);
    }

}
