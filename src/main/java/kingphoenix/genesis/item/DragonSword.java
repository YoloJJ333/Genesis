package kingphoenix.genesis.item;

import kingphoenix.genesis.Genesis;
import kingphoenix.genesis.material.DragonToolMaterial;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DragonSword extends SwordItem{

    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .group(ItemGroup.COMBAT)
            .maxCount(1)
            .fireproof();

    public DragonSword() {
        super(DragonToolMaterial.DRAGON_TOOL_MATERIAL, 0, -2.4F, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ENTITY_ENDER_DRAGON_GROWL, 2.5F, 1F);
        ItemStack stackInHand = user.getStackInHand(hand);
        user.getPitch();
        user.getYaw();
        world.addParticle(ParticleTypes.FLAME, user.getX()+1, user.getY()+1.5F, user.getZ(), 0, 0, 0);
        user.getItemCooldownManager().set(this, 100);
        stackInHand.damage(25, user, (p) -> {
            p.sendToolBreakStatus(hand);
        });
        return TypedActionResult.success(stackInHand);
    }
}