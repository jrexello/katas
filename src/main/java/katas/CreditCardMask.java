package main.java.katas;

import java.util.Iterator;
import java.util.regex.Pattern;

public class CreditCardMask {

    public static String maskify(String toMask) {
        if(toMask.length() < 4) {
            return toMask;
        }
        return "#".repeat(Math.max(0, toMask.length() - 4)) + toMask.substring(toMask.length()-4);
    }
}
