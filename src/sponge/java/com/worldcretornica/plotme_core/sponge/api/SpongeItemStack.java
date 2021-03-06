package com.worldcretornica.plotme_core.sponge.api;

import org.spongepowered.api.item.inventory.ItemStack;

import com.worldcretornica.plotme_core.api.IItemStack;
import com.worldcretornica.plotme_core.api.IMaterial;

public class SpongeItemStack implements IItemStack {

    private final ItemStack itemstack;
    
    public SpongeItemStack(ItemStack is) {
        this.itemstack = is;
    }
    
    @Override
    public IMaterial getType() {
        return new SpongeMaterial(itemstack.getItem());
    }
}
