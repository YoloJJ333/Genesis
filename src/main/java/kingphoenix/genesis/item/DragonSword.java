package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class DragonSword extends Item{
    public static ToolItem DRAGON_SWORD = new SwordItem(DragonToolMaterial.INSTANCE, 10,1.6F, new Item.Settings().group(ItemGroup.COMBAT));
    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .maxCount(1)
            .fireproof();
    public DragonSword() {
        super(settings);
    }
}
