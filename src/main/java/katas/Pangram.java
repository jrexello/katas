package main.java.katas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangram {

    public static boolean pangram(String text) {
        Set<Character> alphabet = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            alphabet.add((char) ('a' + i));
        }
        text = text.toLowerCase().replaceAll("[^a-z]", "");
        Arrays.sort(text.toCharArray());
        Set<Character> lettersInText = text.chars().mapToObj(letter -> (char) letter).collect(Collectors.toSet());
        return lettersInText.equals(alphabet);
    }

}
