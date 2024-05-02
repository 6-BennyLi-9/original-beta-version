package obv;
import mindustry.type.Item;
import arc.util.Log;
public class ModItems implements ContentList{
    public static ModUtils utils;

    public static Item iron;
    public static Item glass;
    public static Item ionicPhaseFabric;
    public static Item fullMobileBattery;
    public static Item emptyMobileBattery;

    private void initItem(){
        iron=new Item("iron");
        glass=new Item("glass");
        ionicPhaseFabric=new Item("IonicPhaseFabric");
        fullMobileBattery=new Item("fullMobileBattery");
        emptyMobileBattery=new Item("emptyMobileBattery");
    }
    private void setupItemConfig(){
        //所需钻头强度
        iron.hardness=1;

        //可燃性，大于0.3会燃烧
        fullMobileBattery.flammability=1;
        emptyMobileBattery.flammability=1;

        //放射性，与RTG直接相关
        ionicPhaseFabric.radioactivity=5;
    }
    private void setupItemScript(){
        //TODO:一点卵用没有
        if(iron.fullIcon!=null)Log.info("[OBV]Full Icom will like this:"+iron.fullIcon.toString());
        else Log.info("[OBV]test Full Icon is null!");
        if(iron.uiIcon!=null)Log.info("[OBV]ui Icon will like this:"+iron.uiIcon.toString());
        else Log.info("[OBV]test ui Icon is null!");
        Log.info("iron's iconID="+iron.iconId);

    }
    private void setupItemColorConfig() {
        iron.color=utils.RGBColorSetWitchHTMLMark(0xaeb7ff);
        glass.color=utils.RGBColorSetWitchHTMLMark(0xdcdcff);
        ionicPhaseFabric.color=utils.RGBColorSetWitchHTMLMark(0xffd59e);
        fullMobileBattery.color=utils.RGBColorSetWitchHTMLMark(0xf8c266);
        emptyMobileBattery.color=utils.RGBColorSetWitchHTMLMark(0x9e7113);
    }
//    @Override
    public void load() {
        utils=new ModUtils();

        initItem();
        setupItemConfig();
        setupItemScript();
        setupItemColorConfig();
    }
    
}