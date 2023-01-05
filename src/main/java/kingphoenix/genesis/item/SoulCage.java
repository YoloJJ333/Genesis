package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import kingphoenix.genesis.material.SoulCageMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolItem;

public class SoulCage extends ToolItem {
    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .maxCount(1)
            .fireproof();

    public SoulCage() {
        super(SoulCageMaterial.SOUL_CAGE_MATERIAL, settings);
    }

//    @Override
//    public void appendToolTip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
//        tooltip.add(Text.of("Souls Collected"));
//    }
}
