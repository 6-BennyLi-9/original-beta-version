package obv.Buildings;

import arc.util.*;
import obv.*;

//HEADER
public class ModBuildingsContent implements ModContentInterface{
    public void load(){
        Log.info("[OBV-BLOCKS]Start init");
        ModWallsContent utils_walls = new ModWallsContent();
        ModFactoriesContent utils_factories = new ModFactoriesContent();

        utils_walls.init();
        utils_factories.init();

        Log.info("[OBV-BLOCKS]Done!");
    }

    @Override
    public boolean enable(){
        return true;
    }
}
