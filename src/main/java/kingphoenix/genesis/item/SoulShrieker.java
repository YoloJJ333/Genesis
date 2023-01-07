package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import kingphoenix.genesis.material.SoulShriekerToolMaterial;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SoulShrieker extends SwordItem{

    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .group(ItemGroup.COMBAT)
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.EPIC);

    public SoulShrieker() {
        super(SoulShriekerToolMaterial.SOUL_SHRIEKER_TOOL_MATERIAL, 0, -2.4F, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ENTITY_WARDEN_SONIC_CHARGE, 2.5F, 1.5F);
        ItemStack stackInHand = user.getStackInHand(hand);
        world.addParticle(ParticleTypes.SONIC_BOOM, user.getX()+2.0F, user.getY()+1.5F, user.getZ(), 0, 0, 0);
        world.addParticle(ParticleTypes.SONIC_BOOM, user.getX()+5.0F, user.getY()+1.5F, user.getZ(), 0, 0, 0);
        world.addParticle(ParticleTypes.SONIC_BOOM, user.getX()+8.0F, user.getY()+1.5F, user.getZ(), 0, 0, 0);
        world.addParticle(ParticleTypes.SONIC_BOOM, user.getX()+11.0F, user.getY()+1.5F, user.getZ(), 0, 0, 0);
        user.getItemCooldownManager().set(this, 200);
        stackInHand.damage(50, user, (p) -> {
            p.sendToolBreakStatus(hand);
        });
        return TypedActionResult.success(stackInHand);
    }
}