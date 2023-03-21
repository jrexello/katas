package main.java.katas;

import java.util.Arrays;

public class Outlier {
    public static int outlier(int[] intArr) {
        int[] even = Arrays.stream(intArr).filter(i -> i % 2 == 0).toArray();
        int[] odd = Arrays.stream(intArr).filter(i -> i % 2 != 0).toArray();

        return even.length < odd.length ? even[0] : odd[0];
    }
}
