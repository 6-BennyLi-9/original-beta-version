package obv.Units;

import arc.util.*;
import obv.*;

public class ModUnitsUtils implements ModContent{

    @Override
    public void load(){
        Log.info("[OBV-UNITS]Start init");
        ModUnits modUnits = new ModUnits();

        modUnits.init();
        Log.info("[OBV-UNITS]DONE!");
    }
}
