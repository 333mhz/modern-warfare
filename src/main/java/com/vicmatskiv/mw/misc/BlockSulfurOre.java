package com.vicmatskiv.mw.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

public class BlockSulfurOre extends Block {
    
    public BlockSulfurOre() {
        super(Material.ROCK);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SulfurOre");
//        setBlockTextureName(ModernWarfareMod.MODID + ":" + "sulfurore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Ores.SulfurDust;
    }

}