package main.java.katas;

public class Diamond {
    public static String printDiamond(int n) {
        if ( n < 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(diamondLine(n,n));
        String row;
        for(int i=n-2; i>0; i = i-2) {
            row = diamondLine(n, i);
            sb.insert(0, row);
            sb.append(row);
        }

        return sb.toString();
    }

    private static String diamondLine(int longestDiamond, int currentDiamond){
        return " ".repeat(Math.max(0, (longestDiamond - currentDiamond)/2)) + "*".repeat(currentDiamond) + "\n";
    }
}
