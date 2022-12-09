package kingphoenix.genesis.item;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItems {
    public static final Item SOUL_CAGE = new SoulCage();
    public static final ToolItem DRAGON_SWORD = new DragonSword();
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("genesis", "soul_cage"), SOUL_CAGE);
        Registry.register(Registry.ITEM, new Identifier("genesis", "dragon_sword"), DRAGON_SWORD);
    }
}
