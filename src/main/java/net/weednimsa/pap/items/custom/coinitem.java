package net.weednimsa.pap.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class coinitem extends Item {
    public coinitem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND)
        {
            outputRandomNumber(player);
            player.getCooldowns().addCooldown(this,20);
        }
        return super.use(level, player, hand);

    }

    private void outputRandomNumber(Player player) {
        if (HeadsOrTails(player) == 1)
        player.sendSystemMessage(Component.literal("It´s Heads"));
        else
            player.sendSystemMessage(Component.literal("It´s Tails"));
    }
    private int HeadsOrTails(Player player)
    {
    return RandomSource.createNewThreadLocalInstance().nextInt(2);
    }

}