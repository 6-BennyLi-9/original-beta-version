package obv;
import arc.util.Log;
import mindustry.mod.Mod;
public class obvJavaMod extends Mod {
    public static ModItems modItems;
    public obvJavaMod() {
        Log.info("[OBV]Loaded Original Beta Version constructor.");
    }
    public void ModInit(){
        ModUtils.debugMode=false;
        modItems=new ModItems();
        modItems.load();
    }
    @Override
    public void loadContent() {
        Log.info("[OBV]Loading content.");
        ModInit();
        Log.info("[OBV]DONE");
    }
}