package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.world.World;

import java.util.List;

public class SoulCage extends Item {
    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .maxCount(1)
            .fireproof();

    public SoulCage() {
        super(settings);
    }

//    @Override
//    public void appendToolTip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
//        tooltip.add(Text.of("Souls Collected"));
//    }
}
