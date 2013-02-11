package mancraft.mining;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "Mining", name = "Mining", version = "0.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Mining {
	
    public static float hardnessDirt;
    public static float hardnessGrass;
    public static float hardnessTilledField;
    public static float hardnessClay;
    public static float hardnessCobblestone;
    public static float hardnessMossyCobblestone;
    public static float hardnessNetherrack;
    public static float hardnessStone;
    public static float hardnessSandStone;
    public static float hardnessBrick;
    public static float hardnessStoneBrick;
    public static float hardnesNethersBrick;

    @Instance("Mining")
    public static Mining instance;

    @SidedProxy(clientSide = "mancraft.mining.client.ClientProxy", serverSide = "mancraft.mining.CommonProxy")
    public static CommonProxy proxy;

    @PreInit
    public void preInit (FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        
        hardnessDirt = config.get("Hardness", "Dirt Hardness", 3).getInt();
        hardnessGrass = config.get("Hardness", "Grass Hardness", 3).getInt();
        hardnessTilledField = config.get("Hardness", "Tilled Field Hardness", 3).getInt();
        hardnessClay = config.get("Hardness", "Clay Hardness", 3).getInt();
        hardnessCobblestone = config.get("Hardness", "Cobblestone Hardness", 15).getInt();
        hardnessMossyCobblestone = config.get("Hardness", "Mossy Cobblestone Hardness", 15).getInt();
        hardnessNetherrack = config.get("Hardness", "Netherrack Hardness", 3).getInt();
        hardnessStone = config.get("Hardness", "Stone Hardness", 15).getInt();
        hardnessSandStone = config.get("Hardness", "Sandstone Hardness", 15).getInt();
        hardnessBrick = config.get("Hardness", "Brick Hardness", 30).getInt();
        hardnessStoneBrick = config.get("Hardness", "Stone Brick Hardness", 30).getInt();
        hardnesNethersBrick = config.get("Hardness", "Nether Brick Hardness", 30).getInt();

        config.save();
    }

    @Init
    public void load (FMLInitializationEvent event) {
    	
        Block.dirt.setHardness(hardnessDirt);
        Block.grass.setHardness(hardnessGrass);
        Block.tilledField.setHardness(hardnessTilledField);
        Block.blockClay.setHardness(hardnessClay);
        Block.cobblestone.setHardness(hardnessCobblestone);
        Block.cobblestoneMossy.setHardness(hardnessMossyCobblestone);
        Block.netherrack.setHardness(hardnessNetherrack);
        Block.stone.setHardness(hardnessStone);
        Block.sandStone.setHardness(hardnessSandStone);
        Block.brick.setHardness(hardnessBrick);
        Block.stoneBrick.setHardness(hardnessStoneBrick);
        Block.netherBrick.setHardness(hardnesNethersBrick); 	
    }

    @PostInit
    public void postInit (FMLPostInitializationEvent event) {
        // Stub Method
    }
}