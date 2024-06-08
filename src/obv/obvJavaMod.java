package obv;
import arc.util.Log;
import mindustry.mod.Mod;
import obv.Buidings.ModBlocksUtils;
import obv.ItemAndLiquid.ModItems;
import obv.ItemAndLiquid.ModLiquids;

public class obvJavaMod extends Mod {
    public static ModItems modItems;
    public static ModBlocksUtils modBlocksUtils;
    public static ModLiquids modLiquids;
    
    public static ModContent[] modContents = {
        modItems=new ModItems(),
        modBlocksUtils=new ModBlocksUtils(),
        modLiquids=new ModLiquids()
    };
    public obvJavaMod() {
        Log.info("[OBV]Loaded Original Beta Version constructor.");
        //I'm really can't believe that this had never used!!!
    }
    public void ModInit(){
        ModUtils.debugMode=false;
        for(ModContent content:modContents){
            content.load();
        }
    }

    @Override
    public void loadContent() {
        Log.info("[OBV]Loading content.");
        ModInit();
        Log.info("[OBV]DONE");
    }
}