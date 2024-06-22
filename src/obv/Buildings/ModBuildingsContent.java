package obv.Buildings;

import arc.util.*;
import obv.*;

//HEADER
public class ModBuildingsContent implements ModContentInterface{
    public static ModWallsContent modWallsContent;
    public static ModFactoriesContent modFactoriesContent;

    public static ModBuildingsContentInterface[] modBuildingsContentInterface = {
    modFactoriesContent = new ModFactoriesContent(),
    modWallsContent = new ModWallsContent()
    };

    public void load(){
        Log.info("[OBV-BLOCKS]Start");

        for(ModBuildingsContentInterface content : modBuildingsContentInterface){
            if(content.enabled()){
                content.load();
            }
        }

        Log.info("[OBV-BLOCKS]Done!");
    }

    @Override
    public boolean enable(){
        return true;
    }
}
