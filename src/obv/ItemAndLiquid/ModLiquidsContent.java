package obv.ItemAndLiquid;

import arc.util.*;
import mindustry.type.*;
import obv.*;

public class ModLiquidsContent implements ModContentInterface{
    private static ModUtils utils;

    public static Liquid essentialOil;
    public static Liquid tila;
    public static Liquid tila_Beta;
    public static Liquid highPurityEssentialOil;
    public static Liquid magicalLiquid;
    public static Liquid superMagicalLiquid;
    public static Liquid tuno;

    private void initLiquid(){
        essentialOil = new Liquid("bioEssentialOil");
        tila = new Liquid("tila");
        tila_Beta = new Liquid("Beta-tila");
        highPurityEssentialOil = new Liquid("HighPurityBioEssentialOil");
        magicalLiquid = new Liquid("magicalLiquid");
        superMagicalLiquid = new Liquid("superMagicalLiquid");
        tuno = new Liquid("tuno");
    }

    private void setupLiquidConfig(){
        //燃烧度
        essentialOil.flammability = 0.3f;
        highPurityEssentialOil.flammability = 0.8f;
        tila.flammability = 0.1f;

        //温度
        tila.temperature = 0.4f;
        tila_Beta.temperature = 0.2f;

        //比热容（每个液体都要设置，除非是0.5f
        superMagicalLiquid.heatCapacity = 0.1f;
        tila.heatCapacity = 0.5f;
        tila_Beta.heatCapacity = 0.7f;

        //粘度
        tuno.viscosity = 1f;
        essentialOil.viscosity = 0.6f;
        highPurityEssentialOil.viscosity = 0.9f;

        //爆炸性
        tuno.explosiveness = 0.7f;
        essentialOil.explosiveness = 0.3f;
        highPurityEssentialOil.explosiveness = 0.6f;
        superMagicalLiquid.explosiveness = 0.2f;

        //调整冷却
        superMagicalLiquid.coolant = false;
    }

    private void setupLiquidColorConfig(){
        tila.color = utils.RGBColorSetWitchHTMLMark(0xcbe1ff);
        tila_Beta.color = utils.RGBColorSetWitchHTMLMark(0xffe166);
        essentialOil.color = utils.RGBColorSetWitchHTMLMark(0x2f5d42);
        highPurityEssentialOil.color = utils.RGBColorSetWitchHTMLMark(0xa18100);
        magicalLiquid.color = utils.RGBColorSetWitchHTMLMark(0x220c47);
        superMagicalLiquid.color = utils.RGBColorSetWitchHTMLMark(0xff3700);
        tuno.color = utils.RGBColorSetWitchHTMLMark(0xcbaeff);
    }

    @Override
    public void load(){
        Log.info("[UBV-LIQUIDS]Start init");
        utils = new ModUtils();
        initLiquid();

        Log.info("[UBV-LIQUIDS]Adding config");
        setupLiquidConfig();
        setupLiquidColorConfig();

        Log.info("[OBV-LIQUIDS]DONE!");
    }

    @Override
    public boolean enable(){
        return true;
    }
}
