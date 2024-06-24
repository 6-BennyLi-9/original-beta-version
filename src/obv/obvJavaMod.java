package obv;

import arc.util.*;
import mindustry.mod.*;
import obv.Buildings.*;
import obv.Bullets.*;
import obv.ItemAndLiquid.*;
import obv.Units.*;

public class obvJavaMod extends Mod{
    public static ModItemsContent modItems;
    public static ModBuildingsContent modBlocksUtils;
    public static ModLiquidsContent modLiquids;
    public static ModUnitsUtilsContent modUnitsUtils;
    public static ModBulletContent modBulletContent;


    public static ModContentInterface[] modContentInterfaces =
    {
    modItems = new ModItemsContent(),
    modBlocksUtils = new ModBuildingsContent(),
    modLiquids = new ModLiquidsContent(),
    modUnitsUtils = new ModUnitsUtilsContent(),
    modBulletContent = new ModBulletContent()
    };

    public obvJavaMod(){
        Log.info("[OBV]Loaded Original Beta Version constructor.");
        //I'm really can't believe that this had never used!!!
    }

    public void ModInit(){
        ModUtils.debugMode = false;
        for(ModContentInterface content : modContentInterfaces){
            if(content.enable()){
                content.init();
                content.load();
            }
        }
    }

    @Override
    public void loadContent(){
        Log.info("[OBV]Loading content.");
        ModInit();
        Log.info("[OBV]DONE");
    }
}