package obv.Units;

import mindustry.type.*;

public class ModUnits{

    public static UnitType crystals;

    private void initUnits(){
        crystals = new UnitType("crystals"){
            {
                health = 80;
                hitSize = 9;
                speed = 3f;
                accel = 0.05f;
                flying = true;
                engineOffset = 5.75f;
            }
        };
    }

    public void init(){
        initUnits();
    }
}
