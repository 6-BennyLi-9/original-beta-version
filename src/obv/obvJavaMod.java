package obv;
import arc.util.Log;
import mindustry.mod.Mod;
import obv.Buidings.ModBlocksUtils;
public class obvJavaMod extends Mod {
    public static ModItems modItems;
    public static ModBlocksUtils modBlocksUtils;
    
    public static ModContent[] modContents = {
        modItems=new ModItems(),
        modBlocksUtils=new ModBlocksUtils()
    };
    public void ModInit(){
        ModUtils.debugMode=true;
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