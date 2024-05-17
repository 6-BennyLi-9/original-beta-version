package obv.Buidings;

import arc.util.Log;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.BuildVisibility;
import obv.ModItems;

public class ModFactories extends ModBlocksUtils{
    public GenericCrafter batteryBiulder;

    private void initFactory(){
        batteryBiulder=new GenericCrafter("batteryBiulder");
    }

    private void setupFactoryConfig(){
        batteryBiulder.hasItems=true;
        batteryBiulder.craftTime=60f;

        batteryBiulder.hasPower=true;
        batteryBiulder.consumePower(40f);

        batteryBiulder.requirements(Category.crafting,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(Items.titanium,80),
            new ItemStack(Items.graphite,50),
            new ItemStack(Items.lead,125),
            new ItemStack(ModItems.iron,30)
        });

        batteryBiulder.consumeItems(new ItemStack[]{
            new ItemStack(Items.surgeAlloy,1),
            new ItemStack(Items.silicon,3)
        });

        batteryBiulder.outputItems=new ItemStack[]{
            new ItemStack(ModItems.emptyMobileBattery,1)
        };

        batteryBiulder.size=3;
    }

    public void init(){
        Log.info("[OBV-FACTORIES]Start init");
        initFactory();

        Log.info("[OBV-FACTORIES]Adding config");
        setupFactoryConfig();
    }
}
