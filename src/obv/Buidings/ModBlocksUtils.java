package obv.Buidings;

import arc.util.*;
import obv.*;

public class ModBlocksUtils implements ModContent{
    public void load(){
        Log.info("[OBV-BLOCKS]Start init");
        ModWalls utils_walls = new ModWalls();
        ModFactories utils_factories = new ModFactories();

        utils_walls.init();
        utils_factories.init();

        Log.info("[OBV-BLOCKS]Done!");
    }
}
