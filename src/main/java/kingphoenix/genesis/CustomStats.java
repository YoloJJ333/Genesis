package kingphoenix.genesis;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomStats {
    public static final Identifier TOTAL_SOULS_COLLECTED = new Identifier("genesis", "total_souls_collected");

    public static void register(){
        Registry.register(Registry.CUSTOM_STAT, "total_souls_collected", TOTAL_SOULS_COLLECTED);
        Stats.CUSTOM.getOrCreateStat(TOTAL_SOULS_COLLECTED, StatFormatter.DEFAULT);
    }
}
