package obv.Buidings;

import arc.util.Log;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.consumers.ConsumePower;
import mindustry.world.meta.BuildVisibility;
import obv.ModItems;

public class ModWalls extends ModBlocksUtils{
    public static Wall bigIronWall;
    public static Wall smallIronWall;
    public static Wall bigIonicChargeWall;
    public static Wall smallIonicChargeWall;

    private void initWall(){
        bigIronWall=new Wall("bigIronWall");
        smallIronWall=new Wall("smallIronWall");
        bigIonicChargeWall=new Wall("bigIonicChargeWall");
        smallIonicChargeWall=new Wall("smallIonicChargeWall");
    }
    private void setupWallConfig(){
        bigIronWall.size=2;
        smallIronWall.size=1;
        bigIonicChargeWall.size=2;
        smallIonicChargeWall.size=1;
    
        bigIronWall.health=3200;
        smallIronWall.health=800;
        bigIonicChargeWall.health=4800;
        smallIonicChargeWall.health=1200;

        bigIonicChargeWall.hasPower=true;
        smallIonicChargeWall.hasPower=true;

        bigIonicChargeWall.consPower=new ConsumePower(100,1000,true);
        smallIonicChargeWall.consPower=new ConsumePower(100,250,true);

        bigIronWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(ModItems.iron,5),
            new ItemStack(ModItems.glass,3),
            new ItemStack(Items.metaglass,3)
        });
        smallIronWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(ModItems.iron,20),
            new ItemStack(ModItems.glass,12),
            new ItemStack(Items.metaglass,7)
        });
        bigIonicChargeWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(ModItems.glass,20),
            new ItemStack(ModItems.ionicPhaseFabric,12),
            new ItemStack(Items.phaseFabric,8),
            new ItemStack(Items.silicon,8),
            new ItemStack(Items.surgeAlloy,12)
        });
        smallIonicChargeWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{
            new ItemStack(ModItems.glass,5),
            new ItemStack(ModItems.ionicPhaseFabric,4),
            new ItemStack(Items.phaseFabric,2),
            new ItemStack(Items.silicon,2),
            new ItemStack(Items.surgeAlloy,3)
        });

        bigIronWall.buildCostMultiplier=1.25f;
        smallIronWall.buildCostMultiplier=0.8f;
        bigIonicChargeWall.buildCostMultiplier=1.25f;
        smallIonicChargeWall.buildCostMultiplier=0.8f;
    }

    public void init(){
        Log.info("[OBV-WALLS]Start init");
        initWall();

        Log.info("[OBV-WALLS]Adding config");
        setupWallConfig();

        Log.info("[OBV-WALLS]Done!");
    }
}
