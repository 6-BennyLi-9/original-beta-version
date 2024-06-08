package obv.ItemAndLiquid;

import arc.util.Log;
import mindustry.type.Liquid;
import obv.ModContent;

public class ModLiquids implements ModContent {

    public static Liquid essentialOil;
    public static Liquid tila;
    public static Liquid tila_Beta;
    public static Liquid HighPurityEssentialOil;
    public static Liquid superMagicalLiquid;

    public void initLiquid(){
        essentialOil=new Liquid("essentialOil");
        tila=new Liquid("tila");
        tila_Beta=new Liquid("Beta-tila");
        HighPurityEssentialOil=new Liquid("HighPurityEssentialOil");
        superMagicalLiquid=new Liquid("superMagicalLiquid");
    }

    @Override
    public void load() {
        Log.info("[UBV-ITEMS]Start init");
        initLiquid();
    }
}
