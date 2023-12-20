package net.darkhax.botanypots.events;

import net.darkhax.botanypots.block.BlockEntityBotanyPot;
import net.darkhax.botanypots.data.recipes.fertilizer.Fertilizer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class LookupFertilizerEvent extends BotanyPotEvent {

    private final BlockState state;

    private final Player player;

    private final InteractionHand hand;

    private final ItemStack stack;

    @Nullable
    private final RecipeHolder<Fertilizer> original;

    @Nullable
    private RecipeHolder<Fertilizer> result;

    public LookupFertilizerEvent(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack stack, BlockEntityBotanyPot pot, RecipeHolder<Fertilizer> original) {

        super(level, pos, pot);
        this.state = state;
        this.player = player;
        this.hand = hand;
        this.stack = stack;
        this.original = original;
        this.result = original;
    }

    public BlockState getBlockState() {

        return this.state;
    }

    public Player getPlayer() {

        return this.player;
    }

    public InteractionHand getHand() {

        return this.hand;
    }

    public ItemStack getStack() {

        return this.stack;
    }

    @Nullable
    public RecipeHolder<Fertilizer> getOriginal() {

        return this.original;
    }

    @Nullable
    public RecipeHolder<Fertilizer> getLookupResult() {

        return this.result;
    }

    public void setLookupResult(@Nullable RecipeHolder<Fertilizer> newResult) {

        this.result = newResult;
    }
}