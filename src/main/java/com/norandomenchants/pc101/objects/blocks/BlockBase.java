package com.norandomenchants.pc101.objects.blocks;

import com.norandomenchants.pc101.NoRandomEnchants;
import com.norandomenchants.pc101.init.ItemInit;
import com.norandomenchants.pc101.util.interfaces.IHasModel;
import com.norandomenchants.pc101.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(NoRandomEnchants.NORANDOMENCHANTSTAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        NoRandomEnchants.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}