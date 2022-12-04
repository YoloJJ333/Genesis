package kingphoenix.genesis.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DragonToolMaterial implements ToolMaterial {
    public static final DragonToolMaterial INSTANCE = new DragonToolMaterial();
    @Override
    public int getDurability() {
        return 2139;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.END_CRYSTAL);
    }
}
