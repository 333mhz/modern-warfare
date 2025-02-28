package com.vicmatskiv.mw.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

public class BlockLeadOre extends Block {
    
    public BlockLeadOre() {
        super(Material.ROCK);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LeadOre");
//        setBlockTextureName(ModernWarfareMod.MODID + ":" + "leadore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    public Block getBlockDropped(int meta, Random rand, int fortune) {
        return Ores.LeadOre;
    }

}