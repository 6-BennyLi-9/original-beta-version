package obv.Units;

import arc.util.*;
import obv.*;

public class ModUnitsUtilsContent implements ModContentInterface{
    @Override
    public void load(){

        Log.info("[OBV-UNITS]Start init");
        ModUnits modUnits = new ModUnits();

        modUnits.init();
        Log.info("[OBV-UNITS]DONE!");
    }

    @Override
    public boolean enable(){
        return false;
    }
}
