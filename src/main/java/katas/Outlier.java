package main.java.katas;

public class Outlier {

    public static int outlier(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (i == 0) {
                if ((intArr[0] % 2 != intArr[1] % 2) && intArr[0] % 2 != intArr[2] % 2) {
                    return intArr[0];
                }
            } else if(i == intArr.length - 1) {
                if ((intArr[intArr.length - 3] % 2 != intArr[intArr.length - 2] % 2) && intArr[intArr.length - 2] % 2 != intArr[intArr.length - 1] % 2) {
                    return intArr[i];
                }
            } else {
                if ((intArr[i - 1] % 2 != intArr[i] % 2) && intArr[i] % 2 != intArr[i + 1] % 2) {
                    return intArr[i];
                }
            }


        }
        return intArr[0];
    }

}
