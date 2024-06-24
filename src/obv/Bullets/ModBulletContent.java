package obv.Bullets;

import mindustry.*;
import mindustry.content.*;
import mindustry.world.blocks.defense.turrets.*;
import obv.ItemAndLiquid.*;
import obv.*;

public class ModBulletContent implements ModContentInterface{
    PowerOrb powerOrb;

    public void initBullets(){
        powerOrb = new PowerOrb(5f, 20f){{
            textureName = Vars.content.transformName("powerOrb");//注册内容名称
            lifetime = 50;//持续存在时长
        }};
    }

    public void addBulletsToTurrets(){
        ((ItemTurret)Blocks.duo).ammoTypes.put(ModItemsContent.fullMobileBattery, powerOrb);
    }

    @Override
    public void load(){
        initBullets();
        addBulletsToTurrets();
    }

    @Override
    public boolean enable(){
        return true;
    }
}
