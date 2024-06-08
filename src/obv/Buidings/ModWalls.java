package obv.Buidings;

import arc.util.Log;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.ShieldWall;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.consumers.ConsumePower;
import mindustry.world.meta.BuildVisibility;
import obv.ItemAndLiquid.ModItems;

public class ModWalls extends ModBlocksUtils{
    //T1
    public Wall bigIronWall,smallIronWall;
    //T2
    public ShieldWall bigIonicChargeWall,smallIonicChargeWall;

    private void initWall(){
        bigIronWall=new Wall("bigIronWall");
        smallIronWall=new Wall("smallIronWall");
        bigIonicChargeWall=new ShieldWall("bigIonicChargeWall");
        smallIonicChargeWall=new ShieldWall("smallIonicChargeWall");
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

        //可以存储电力
        bigIonicChargeWall.hasPower=true;
        smallIonicChargeWall.hasPower=true;

        //电力设置
        bigIonicChargeWall.consPower=new ConsumePower(100,1000,true);
        bigIonicChargeWall.consumePower(500f/60f);
        bigIonicChargeWall.hasPower=true;
        bigIonicChargeWall.conductivePower=true;
        smallIonicChargeWall.consPower=new ConsumePower(100,250,true);
        smallIonicChargeWall.consumePower(125f/60f);
        smallIonicChargeWall.hasPower=true;
        smallIonicChargeWall.conductivePower=true;

        //探测迷雾能力
        bigIonicChargeWall.fogRadius=5;
        smallIonicChargeWall.fogRadius=2;

        //伤害吸收
        smallIronWall.armor=1f;
        bigIronWall.armor=4f;
        smallIonicChargeWall.armor=4f;
        bigIonicChargeWall.armor=16f;
        //盾容量
        smallIonicChargeWall.shieldHealth=50f;
        bigIonicChargeWall.shieldHealth=200f;

        //盾恢复速度 1f=60hp/s
        smallIonicChargeWall.regenSpeed=0.5f;
        bigIonicChargeWall.regenSpeed=1f;

        //盾损坏后恢复时间
        smallIonicChargeWall.breakCooldown=10f*10f;
        bigIonicChargeWall.breakCooldown=20f*10f;

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
