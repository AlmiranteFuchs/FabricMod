package net.hoefel;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class hoefelitem extends Item {

    public hoefelitem(Settings settings) {
        super(settings);
        // TODO Auto-generated constructor stub
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE, 1.0f, 1.0f);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }

}
