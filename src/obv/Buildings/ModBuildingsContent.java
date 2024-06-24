package obv.Buildings;

import arc.util.*;
import obv.*;

//HEADER
public class ModBuildingsContent implements ModContentInterface{
    public static ModWallsContent utils_walls;
    public static ModFactoriesContent utils_factories;

    public ModBuildingsContentInterface[] modBuildingsContentInterface=
    {
    utils_walls=new ModWallsContent(),
    utils_factories=new ModFactoriesContent()
    };

    @Override
    public void init(){
        for(ModBuildingsContentInterface content:modBuildingsContentInterface){
            if(content.enable()){
                content.init();
                content.load();
            }
        }
    }

    public void load(){
        Log.info("[OBV-BLOCKS]Start init");

        Log.info("[OBV-BLOCKS]Done!");
    }

    @Override
    public boolean enable(){
        return true;
    }
}
