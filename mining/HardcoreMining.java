package mancraft.mining;

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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


@Mod(modid="HardcoreMining", name="Hardcore Mining", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class HardcoreMining {

        // The instance of your mod that Forge uses.
        @Instance("HardcoreMining")
        public static HardcoreMining instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="mancraft.mining.client.ClientProxy", serverSide="mancraft.mining.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {

            Block.dirt.setHardness(2.0F);
            Block.grass.setHardness(2.0F);
            Block.tilledField.setHardness(2.0F);
            Block.blockClay.setHardness(2.0F);
            Block.cobblestone.setHardness(2.0F);
            Block.cobblestoneMossy.setHardness(15.0F);
            Block.netherrack.setHardness(2.0F);

            Block.stone.setHardness(15.0F);
            Block.sandStone.setHardness(15.0F);

            Block.brick.setHardness(50.0F).setResistance(30.0F);
            Block.stoneBrick.setHardness(50.0F).setResistance(30.0F);
            Block.netherBrick.setHardness(50.0F).setResistance(30.0F);
        }
}