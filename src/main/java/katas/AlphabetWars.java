package main.java.katas;

public class AlphabetWars {
    public static String alphabetWar(String fight) {
        char[] rightPower = {'z', 'd', 'q', 'm'};
        char[] leftPower = {'s', 'b', 'p', 'w'};

        int rightScore = 0;
        int leftScore = 0;

        for (int i = 0; i < fight.length(); i++) {
            for (int j = 0; j < 4; j++) {
                if (rightPower[j] == fight.charAt(i)) {
                    rightScore += j+1;
                } else if (leftPower[j] == fight.charAt(i)) {
                    leftScore += j+1;
                }
            }
        }

        if (rightScore > leftScore) {
            return "Right side wins!";
        } else if (rightScore < leftScore) {
            return "Left side wins!";
        }

        return "Let's fight again!";
    }

}
