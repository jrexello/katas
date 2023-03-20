package main.java;

import java.util.Scanner;

import static main.java.katas.AlphabetWars.alphabetWar;
import static main.java.katas.CreditCardMask.maskify;
import static main.java.katas.Isogram.isogram;
import static main.java.katas.Outlier.outlier;
import static main.java.katas.Pangram.pangram;

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
    }

}
