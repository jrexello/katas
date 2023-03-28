package main.java;

import java.util.Scanner;

import static main.java.katas.AlphabetWars.alphabetWar;
import static main.java.katas.CamelCaser.toCamelCase;
import static main.java.katas.CreditCardMask.maskify;
import static main.java.katas.Diamond.printDiamond;
import static main.java.katas.Isogram.isogram;
import static main.java.katas.Outlier.outlier;
import static main.java.katas.Pangram.pangram;
import static main.java.katas.RGBToHex.rgbToHex;
import static main.java.katas.TrailNumber.incrementString;

public class KataThings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        String input = scanner.nextLine();

        //System.out.println(alphabetWar(input));
        //System.out.println(maskify(input));
        //System.out.println((pangram(input) ? "True" : "False"));
        //System.out.println((isogram(input) ? "True" : "False"));
        //System.out.println(outlier());
        //System.out.println(rgbToHex(-20, 275, 125));
        //System.out.println(incrementString(input));
        //System.out.println(toCamelCase(input));
        System.out.println(printDiamond(Integer.parseInt(input)));
    }

}
