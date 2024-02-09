package me.huanmeng.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {

    /*
     * .hunger() //这里是int值，回复饥饿值
     * .saturationModifier() //这里是float值，回复饱和度
     * .statusEffect() //这里是食物效果，原版中20tick为一秒
     * .meat() //是否为肉食（即能不能给狗吃）
     * .snack() //快速食用
     * .alwaysEdible() //在任何时候都可以食用（即使饥饿值满的）
     */

    public static final FoodComponent EXAMPLE_FOOD = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*10 ), 1)
            .build();
}
