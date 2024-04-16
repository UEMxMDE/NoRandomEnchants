package com.norandomenchants.pc101.tabs;

import com.norandomenchants.pc101.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NoRandomEnchantsTab extends CreativeTabs
{
    public NoRandomEnchantsTab(String label)
    {
        super("norandomenchantstab");
        this.setBackgroundImageName("norandomenchants.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.OBSIDIAN_INGOT);
    }
}
