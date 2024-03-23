package com.norandomenchants.pc101.objects.items;

import com.norandomenchants.pc101.NoRandomEnchants;
import com.norandomenchants.pc101.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import com.norandomenchants.pc101.init.ItemInit;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NoRandomEnchants.NORANDOMENCHANTSTAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        NoRandomEnchants.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
