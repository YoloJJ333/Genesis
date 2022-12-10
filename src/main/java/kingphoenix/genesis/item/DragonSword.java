package kingphoenix.genesis.item;

import kingphoenix.genesis.DragonToolMaterial;
import kingphoenix.genesis.Genesis;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.minecraft.sound.SoundEvents.ENTITY_ENDER_DRAGON_GROWL;

public class DragonSword extends SwordItem{

    public static FabricItemSettings settings = new FabricItemSettings()
            .group(Genesis.MYTHICAL_ITEMS)
            .group(ItemGroup.COMBAT)
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.EPIC);

    public DragonSword() {
        super(DragonToolMaterial.INSTANCE, 0, -2.4F, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ENTITY_ENDER_DRAGON_GROWL, 2.5F, 1F);
        ItemStack stackInHand = user.getStackInHand(hand);
        stackInHand.decrement(1);
        return TypedActionResult.success(stackInHand);
    }
}
