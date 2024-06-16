package obv;

import arc.util.*;
import mindustry.mod.*;
import obv.Buidings.*;
import obv.ItemAndLiquid.*;
import obv.Units.*;

public class obvJavaMod extends Mod{
    public static ModItemsInterface modItems;
    public static ModBlocksUtilsInterface modBlocksUtils;
    public static ModLiquidsInterface modLiquids;
    public static ModUnitsUtilsInterface modUnitsUtils;

    public static ModContentInterface[] modContentInterfaces = {
    modItems = new ModItemsInterface(),
    modBlocksUtils = new ModBlocksUtilsInterface(),
    modLiquids = new ModLiquidsInterface(),
    modUnitsUtils = new ModUnitsUtilsInterface()
    };

    public obvJavaMod(){
        Log.info("[OBV]Loaded Original Beta Version constructor.");
        //I'm really can't believe that this had never used!!!
    }

    public void ModInit(){
        ModUtils.debugMode = false;
        for(ModContentInterface content : modContentInterfaces){
            content.load();
        }
    }

    @Override
    public void loadContent(){
        Log.info("[OBV]Loading content.");
        ModInit();
        Log.info("[OBV]DONE");
    }
}