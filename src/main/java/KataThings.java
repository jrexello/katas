package main.java;

import java.util.Scanner;

import static main.java.katas.AlphabetWars.alphabetWar;
import static main.java.katas.CreditCardMask.maskify;

public class KataThings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        String input = scanner.nextLine();

        //System.out.println(alphabetWar(input));
        System.out.println(maskify(input));

    }

}
