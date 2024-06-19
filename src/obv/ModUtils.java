package obv;

import arc.graphics.*;
import arc.util.*;

public class ModUtils{
    public static boolean debugMode = true;

    public Color RGBColorSet100(double R, double G, double B){
        Color result;
        result = new Color((float)R / 100, (float)G / 100, (float)B / 100);
        return result;
    }

    public Color RGBColorSet256(float R, float G, float B){
        Color result;
        result = RGBColorSet100(R * 0.390625, G * 0.390625, B * 0.390625);
        return result;
    }

    public Color RGBColorSetWitchHTMLMark(int mark){
        Color result;
        int r = mark >> 16;
        int g = (mark >> 8) - (r << 8);
        int b = (mark) - (g << 8) - (r << 16);
        if(ModUtils.debugMode) Log.info("Try RGB:" + r + "," + g + "," + b + " mark=" + mark);
        result = RGBColorSet256(r, g, b);
        return result;
    }
}
