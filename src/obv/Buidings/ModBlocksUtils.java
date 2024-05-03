package obv.Buidings;
import arc.util.Log;
import obv.ModContent;

public class ModBlocksUtils implements ModContent{
    private ModWalls utils_walls;
    
    public void load(){
        Log.info("[OBV-BLOCKS]Start init");
        utils_walls=new ModWalls();
        
        utils_walls.init();

        Log.info("[OBV-ITEMS]Done!");
    }
}
