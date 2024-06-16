package obv.Buidings;

import arc.util.*;
import obv.*;

public class ModBlocksUtilsInterface implements ModContentInterface {
    public void load(){
        Log.info("[OBV-BLOCKS]Start init");
        ModWallsInterface utils_walls = new ModWallsInterface();
        ModFactoriesInterface utils_factories = new ModFactoriesInterface();

        utils_walls.init();
        utils_factories.init();

        Log.info("[OBV-BLOCKS]Done!");
    }
}
