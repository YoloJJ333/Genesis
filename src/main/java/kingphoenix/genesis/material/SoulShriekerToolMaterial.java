package kingphoenix.genesis.material;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SoulShriekerToolMaterial implements ToolMaterial {
    public static final SoulShriekerToolMaterial SOUL_SHRIEKER_TOOL_MATERIAL = new SoulShriekerToolMaterial();
    @Override
    public int getDurability() {return 1725;}

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.NETHERITE;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.ECHO_SHARD);
    }
}
