package kingphoenix.genesis.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItems {
    public static final Item SOUL_CAGE = new SoulCage();
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("genesis", "soul_cage"), SOUL_CAGE);
    }
}
