package obv.ClassTypes;

import mindustry.*;
import mindustry.type.*;

public class OBV_UnitType extends UnitType{
    public OBV_UnitType(String name, String MDTName){
        super(name);

        constructor = Vars.content.unit(MDTName).constructor;
        controller = Vars.content.unit(MDTName).controller;
    }
}