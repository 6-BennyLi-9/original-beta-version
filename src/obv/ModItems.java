package obv;
import mindustry.type.Item;
public class ModItems{
    public static Item iron;
    public static Item glass;
    public static Item ionicPhaseFabric;
    public static Item fullMobileBattery;
    public static Item emptyMobileBattery;

    public void  setupItemConfig(){
        //强度
        iron.hardness=100;
        ionicPhaseFabric.hardness=12;
        fullMobileBattery.hardness=5;
        emptyMobileBattery.hardness=5;

        //可燃性，大于0.3会燃烧
        fullMobileBattery.flammability=1;
        emptyMobileBattery.flammability=1;

        //放射性，与RTG直接相关
        ionicPhaseFabric.radioactivity=5;
    }
    public void setupItemScript(){

        /*
         * fullIcon =
            Core.atlas.find(getContentType().name() + "-" + name + "-full",
            Core.atlas.find(name + "-full",
            Core.atlas.find(name,
            Core.atlas.find(getContentType().name() + "-" + name,
            Core.atlas.find(name + "1")))));
            uiIcon = Core.atlas.find(getContentType().name() + "-" + name + "-ui", fullIcon);
         */
        
    }
//    @Override
    public void load() {
        iron=new Item("iron");
        glass=new Item("glass");
        ionicPhaseFabric=new Item("IonicPhaseFabric");
        fullMobileBattery=new Item("fullMobileBattery");
        emptyMobileBattery=new Item("emptyMobileBattery");

        setupItemConfig();
        setupItemScript();
    }
}