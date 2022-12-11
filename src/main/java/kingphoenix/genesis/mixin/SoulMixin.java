package kingphoenix.genesis.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlayerEntity.class)
public class SoulMixin {
    public int souls;
}
