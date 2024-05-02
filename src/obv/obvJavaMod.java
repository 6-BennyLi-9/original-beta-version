package obv;
import arc.util.Log;
import mindustry.mod.Mod;
public class obvJavaMod extends Mod {
    public static ModItems modItems;
    public obvJavaMod() {
        Log.info("Loaded Original Beta Version constructor.");
    }
    public void ModInit(){
        modItems=new ModItems();
        modItems.load();
    }
    @Override
    public void loadContent() {
        Log.info("Loading content.");
        ModInit();
        Log.info("DONE");
    }
}