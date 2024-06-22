package obv.Units;

public class ModUnits{

    public static OBV_UnitType crystals;

    private void initUnits(){
        crystals = new OBV_UnitType("crystals", "crystals"){
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
