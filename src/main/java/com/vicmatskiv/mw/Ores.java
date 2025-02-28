package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.mw.misc.BlockCopperOre;
import com.vicmatskiv.mw.misc.BlockGraphiteOre;
import com.vicmatskiv.mw.misc.BlockLeadOre;
import com.vicmatskiv.mw.misc.BlockSulfurOre;
import com.vicmatskiv.mw.misc.BlockTinOre;
import com.vicmatskiv.mw.misc.ItemCarbonComposite;
import com.vicmatskiv.mw.misc.ItemCarbonFiber;
import com.vicmatskiv.mw.misc.ItemCopperIngot;
import com.vicmatskiv.mw.misc.ItemGraphiteChunk;
import com.vicmatskiv.mw.misc.ItemGunmetalComposite;
import com.vicmatskiv.mw.misc.ItemGunmetalIngot;
import com.vicmatskiv.mw.misc.ItemGunmetalPlate;
import com.vicmatskiv.mw.misc.ItemLeadIngot;
import com.vicmatskiv.mw.misc.ItemPlasticPlate;
import com.vicmatskiv.mw.misc.ItemSteelDust;
import com.vicmatskiv.mw.misc.ItemSteelIngot;
import com.vicmatskiv.mw.misc.ItemSyntheticPlastic;
import com.vicmatskiv.mw.misc.ItemSyntheticPolymerComposite;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class Ores {

    public static final String DUST_SULFUR = "dustSulfur";
    public static final String INGOT_STEEL = "ingotSteel";
    public static final String INGOT_COPPER = "ingotCopper";
    public static final String INGOT_TIN = "ingotTin";
    public static final String INGOT_LEAD = "ingotLead";

    public static Block LeadOre;
    public static Item LeadIngot;
    
    public static Block CopperOre;
    public static Item CopperIngot;
    
    public static Block GraphiteOre;
    public static Item GraphiteChunk;
    
    public static Block TinOre;
    public static Item TinIngot;
    
    public static Block SulfurOre;
    public static Item SulfurDust;
    
    public static Item GunmetalComposite;
    public static Item GunmetalIngot;
    public static Item GunmetalPlate;
    
    public static Item SteelDust;
    public static Item SteelIngot;
    
    public static Item CarbonComposite;
    public static Item CarbonFiber;
    public static Item SyntheticPolymerComposite;
    public static Item SyntheticPlastic;
    public static Item PlasticPlate;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {


        LeadOre = new BlockLeadOre();
        LeadIngot = new ItemLeadIngot();

        CopperOre = new BlockCopperOre();
        CopperIngot = new ItemCopperIngot();
        
        GraphiteOre = new BlockGraphiteOre();
        GraphiteChunk = new ItemGraphiteChunk();

        TinOre = new BlockTinOre();
        TinIngot = new ItemTinIngot();

        SulfurOre = new BlockSulfurOre();
        SulfurDust = new ItemSulfurDust();

        SteelDust = new ItemSteelDust();
        SteelIngot = new ItemSteelIngot();
        
        GunmetalComposite = new ItemGunmetalComposite();
        GunmetalIngot = new ItemGunmetalIngot();
        GunmetalPlate = new ItemGunmetalPlate();
        
        CarbonComposite = new ItemCarbonComposite();
        CarbonFiber = new ItemCarbonFiber();
        SyntheticPolymerComposite = new ItemSyntheticPolymerComposite();
        SyntheticPlastic = new ItemSyntheticPlastic();
        PlasticPlate = new ItemPlasticPlate();
        
        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, LeadOre, "LeadOre");
        compatibility.registerItem(ModernWarfareMod.MODID, LeadIngot, "leadingot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, CopperOre, "CopperOre");
        compatibility.registerItem(ModernWarfareMod.MODID, CopperIngot, "CopperIngot");
        
        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, GraphiteOre, "GraphiteOre");
        compatibility.registerItem(ModernWarfareMod.MODID, GraphiteChunk, "GraphiteChunk");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, TinOre, "TinOre");
        compatibility.registerItem(ModernWarfareMod.MODID, TinIngot, "TinIngot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, SulfurOre, "SulfurOre");
        compatibility.registerItem(ModernWarfareMod.MODID, SulfurDust, "SulfureDust");

        compatibility.registerItem(ModernWarfareMod.MODID, SteelDust, "SteelDust");
        compatibility.registerItem(ModernWarfareMod.MODID, SteelIngot, "SteelIngot");
        
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalIngot, "GunmetalIngot");
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalPlate, "GunmetalPlate");
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalComposite, "GunmetalComposite");
        
        compatibility.registerItem(ModernWarfareMod.MODID, CarbonComposite, "CarbonComposite");
        compatibility.registerItem(ModernWarfareMod.MODID, CarbonFiber, "CarbonFiber");
        compatibility.registerItem(ModernWarfareMod.MODID, SyntheticPolymerComposite, "SyntheticPolymerComposite");
        compatibility.registerItem(ModernWarfareMod.MODID, SyntheticPlastic, "SyntheticPlastic");
        compatibility.registerItem(ModernWarfareMod.MODID, PlasticPlate, "PlasticPlate");


        OreDictionary.registerOre(INGOT_LEAD, LeadIngot);
        OreDictionary.registerOre(INGOT_COPPER, CopperIngot);
        OreDictionary.registerOre(INGOT_TIN, TinIngot);
        OreDictionary.registerOre(DUST_SULFUR, SulfurDust);
        OreDictionary.registerOre(INGOT_STEEL, SteelIngot);
    }

}
