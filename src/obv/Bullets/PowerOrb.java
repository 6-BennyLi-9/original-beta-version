package obv.Bullets;

import arc.*;
import arc.graphics.g2d.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;

public class PowerOrb extends BulletType{
    public TextureRegion orbTR;
    public String textureName = "";

    public PowerOrb(float speed, float damage){
        super(speed, damage);
    }

    public float dmgIncrease = 2f / 60f;

    @Override
    public void update(Bullet bullet){
        super.update(bullet);
        bullet.damage += dmgIncrease;
    }

    @Override
    public void draw(Bullet bullet){
        super.draw(bullet);
        Draw.rect(orbTR, bullet.x, bullet.y);
    }

    @Override
    public void load(){
        super.load();
        orbTR = Core.atlas.find(textureName);
    }
}
