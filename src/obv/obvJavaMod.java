package obv;

import arc.util.*;
import mindustry.mod.*;
import obv.Buidings.*;
import obv.ItemAndLiquid.*;
import obv.Units.*;

public class obvJavaMod extends Mod{
    public static ModItems modItems;
    public static ModBlocksUtils modBlocksUtils;
    public static ModLiquids modLiquids;
    public static ModUnitsUtils modUnitsUtils;

    public static ModContent[] modContents = {
    modItems = new ModItems(),
    modBlocksUtils = new ModBlocksUtils(),
    modLiquids = new ModLiquids(),
    modUnitsUtils = new ModUnitsUtils()
    };

    public obvJavaMod(){
        Log.info("[OBV]Loaded Original Beta Version constructor.");
        //I'm really can't believe that this had never used!!!
    }

    public void ModInit(){
        ModUtils.debugMode = false;
        for(ModContent content : modContents){
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