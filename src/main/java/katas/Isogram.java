package main.java.katas;

public class Isogram {

    public static boolean isogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
