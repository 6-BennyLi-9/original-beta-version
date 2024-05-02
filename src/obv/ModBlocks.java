package obv;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;

public class ModBlocks implements ContentList{

    public static Wall bigIronWall;
    public static Wall smallIronWall;

    private void initWall(){
        bigIronWall=new Wall("bigIronWall");
        smallIronWall=new Wall("smallIronWall");
    }
    private void setupWallConfig(){
        bigIronWall.size=2;
        smallIronWall.size=1;
    
        bigIronWall.health=3200;
        smallIronWall.health=800;

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
        bigIronWall.buildCostMultiplier=1.25f;
        smallIronWall.buildCostMultiplier=0.8f;
    }
    public void load(){

        initWall();
        setupWallConfig();

    }
}
