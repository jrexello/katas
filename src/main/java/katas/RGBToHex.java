package main.java.katas;

public class RGBToHex {

    public static String rgbToHex(int r, int g, int b) {
        String hexFormat = "%1$02X";
        r = Math.max(Math.min(r, 255), 0);
        g = Math.max(Math.min(g, 255), 0);
        b = Math.max(Math.min(b, 255), 0);
        return String.format(hexFormat,r) + String.format(hexFormat,g) + String.format(hexFormat,b);
    }

}
