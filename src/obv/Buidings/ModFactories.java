package obv.Buidings;

import arc.util.Log;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.BuildVisibility;
import obv.ItemAndLiquid.ModItems;

public class ModFactories extends ModBlocksUtils{
    public GenericCrafter batteryBiulder,charger;
    public assemblyGenerator disCharger;

    private void initFactory(){
        batteryBiulder=new GenericCrafter("batteryBiulder");
        charger=new GenericCrafter("charger");
        disCharger=new assemblyGenerator("disCharger");
    }

    private void setupFactoryConfig(){
        batteryBiulder.hasItems=true;
        charger.hasItems=true;
        disCharger.hasItems=true;

        batteryBiulder.craftTime=60f;
        charger.craftTime=10f;
        disCharger.craftTime=10f;

        batteryBiulder.hasPower=true;
        charger.hasPower=true;
        disCharger.hasPower=true;

        batteryBiulder.consumePower(3f);//1f=60/s
        charger.consumePower(100f);
        disCharger.outputsPower=true;
        disCharger.consumesPower=false;
        disCharger.powerProduction=100f;

        batteryBiulder.health=320;
        charger.health=450;
        disCharger.health=450;

        batteryBiulder.requirements(Category.crafting,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(Items.titanium,80),
            new ItemStack(Items.graphite,50),
            new ItemStack(Items.lead,125),
            new ItemStack(ModItems.iron,30)
        });
        charger.requirements(Category.crafting,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(Items.surgeAlloy,25),
            new ItemStack(Items.silicon,80),
            new ItemStack(Items.titanium,80),
            new ItemStack(Items.graphite,50),
            new ItemStack(Items.lead,125),
            new ItemStack(ModItems.iron,30),
            new ItemStack(Items.phaseFabric,30)
        });
        disCharger.requirements(Category.crafting,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(Items.surgeAlloy,30),
            new ItemStack(Items.silicon,120),
            new ItemStack(Items.titanium,80),
            new ItemStack(Items.graphite,50),
            new ItemStack(Items.lead,125),
            new ItemStack(ModItems.iron,30),
            new ItemStack(Items.phaseFabric,15)
        });

        batteryBiulder.consumeItems(new ItemStack[]{
            new ItemStack(Items.surgeAlloy,1),
            new ItemStack(Items.silicon,3)
        });
        charger.consumeItems(new ItemStack[]{
            new ItemStack(ModItems.emptyMobileBattery,1)
        });
        disCharger.consumeItems(new ItemStack[]{
            new ItemStack(ModItems.fullMobileBattery,1)
        });
        
        batteryBiulder.outputItems=new ItemStack[]{
            new ItemStack(ModItems.emptyMobileBattery,1)
        };
        charger.outputItems=new ItemStack[]{
            new ItemStack(ModItems.fullMobileBattery,1)
        };
        disCharger.outputItems=new ItemStack[]{
            new ItemStack(ModItems.emptyMobileBattery,1)
        };


        batteryBiulder.size=3;
        charger.size=3;
        disCharger.size=3;
    }

    public void init(){
        Log.info("[OBV-FACTORIES]Start init");
        initFactory();

        Log.info("[OBV-FACTORIES]Adding config");
        setupFactoryConfig();
    }
}
