package obv;
import arc.Core;
import arc.graphics.g2d.TextureRegion;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;

public class ModBlocks extends Wall implements ContentList{
    public ModBlocks(String name) {
        super(name);
    }
    
    public static Wall bigIronWall;
    public static Wall smallIronWall;

    public class WallsExpresionConfig extends WallBuild{
        private TextureRegion[] states;
        private int stateNumberCount;

        private void initWall(){
            bigIronWall=new Wall("bigIronWall");
            smallIronWall=new Wall("smallIronWall");
        }
        private void setupWallConfig(){
            bigIronWall.size=2;
            smallIronWall.size=1;
    
            bigIronWall.health=3200;
            smallIronWall.health=800;
    
            bigIronWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{});
            smallIronWall.requirements(Category.defense,BuildVisibility.shown,new ItemStack[]{});
    
            bigIronWall.buildCostMultiplier=1.25f;
            smallIronWall.buildCostMultiplier=0.8f;
        }
        public void load(){
            states = new TextureRegion[stateNumberCount];
            for (int i = 0; i < stateNumberCount; i++) {
                // name 是 Block 的注册名
                states[i] = Core.atlas.find(name + "-" + i);
            }

            initWall();
            setupWallConfig();
        }
    }

    public WallsExpresionConfig wallUtils;

    public void load(){
        super.load();
        
        wallUtils=new WallsExpresionConfig();
        wallUtils.load();

    }
}
