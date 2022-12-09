package kingphoenix.genesis.mixin;

import com.mojang.authlib.GameProfile;
import kingphoenix.genesis.Genesis;
import kingphoenix.genesis.item.CustomItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.encryption.PlayerPublicKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class SoulMixin extends PlayerEntity {
    public SoulMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile, @Nullable PlayerPublicKey publicKey) {
        super(world, pos, yaw, gameProfile, publicKey);
    }

    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public boolean isCreative() {
        return false;
    }

    @Inject(
            at = @At("HEAD"),
            method = "updateKilledAdvancementCriterion(Lnet/minecraft/entity/Entity;ILnet/minecraft/entity/damage/DamageSource;)V"
    )
    public void addSoul(Entity entityKilled, int score, DamageSource damageSource, CallbackInfo ci) {
        this.increaseStat(Genesis.TOTAL_SOULS_COLLECTED, this.getInventory().count(CustomItems.SOUL_CAGE));
    }
}
