package kingphoenix.genesis.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class FluorescentLight extends Block {
    static FabricBlockSettings settings = FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f);

    public FluorescentLight(){
        super(settings);
    }

}

