package obv.Buidings;
import arc.util.Log;
import obv.ModContent;

public class ModBlocksUtils implements ModContent{
    private ModWalls        utils_walls;
    private ModFactories    utils_factories;
    
    public void load(){
        Log.info("[OBV-BLOCKS]Start init");
        utils_walls=new ModWalls();
        utils_factories=new ModFactories();
        
        utils_walls.init();
        utils_factories.init();

        Log.info("[OBV-BLOCKS]Done!");
    }
}
