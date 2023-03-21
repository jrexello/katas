package main.java.katas;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrailNumber {

    public static String incrementString(String str) {
        String trailDigits = "\\d+$";
        Matcher matcher = Pattern.compile(trailDigits).matcher(str);
        if(matcher.find()) {
            String newValue = String.valueOf((new BigInteger(matcher.group()).add(new BigInteger("1"))));
            if(matcher.group().length() >= newValue.length()){
                return str.replaceAll("\\d{"+newValue.length()+"}$", newValue);
            }
            return str.replaceAll(trailDigits, newValue);
        }
        return str + "1";
    }

}
