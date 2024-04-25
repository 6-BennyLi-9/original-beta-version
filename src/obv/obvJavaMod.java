package obv;
import arc.util.Log;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.type.*;
import mindustry.mod.Mod;
public class obvJavaMod extends Mod {
    public static ModItems modItems;
    public obvJavaMod() {
        Log.info("Loaded TutorialMod constructor.");
    }
    @Override
    public void loadContent() {
        Log.info("Loading some tutorial content.");
        modItems=new ModItems();
        modItems.load();
    }
}