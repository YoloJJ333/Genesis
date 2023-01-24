package kingphoenix.genesis.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItems {
    public static final Item SOUL_CAGE = new SoulCage();
    public static final ToolItem SOUL_SHRIEKER = new SoulShrieker();
    public static final ToolItem DRAGON_SWORD = new DragonSword();
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("genesis", "soul_cage"), SOUL_CAGE);
        Registry.register(Registry.ITEM, new Identifier("genesis", "dragon_sword"), DRAGON_SWORD);
        Registry.register(Registry.ITEM, new Identifier("genesis", "soul_shrieker"), SOUL_SHRIEKER);
    }
}
