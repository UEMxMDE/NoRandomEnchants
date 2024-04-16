package com.norandomenchants.pc101.init;

import com.norandomenchants.pc101.objects.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
}
