package obv.Units;

import arc.util.*;
import obv.*;

public class ModUnitsUtilsContent implements ModContentInterface{
    @Override
    public void init(){

    }

    @Override
    public void load(){

        Log.info("[OBV-UNITS]Start");
        ModUnits modUnits = new ModUnits();

        modUnits.init();
    }

    @Override
    public boolean enable(){
        return false;
    }
}
