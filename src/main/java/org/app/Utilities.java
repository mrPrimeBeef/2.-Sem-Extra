package org.app;

public class Utilities {

    public static int trailingZeros(int num){
        String numLength = Integer.toString(num);

        StringBuilder result = new StringBuilder();

        int length = numLength.length();

        result.append(Integer.toString(num));

        for (int i = 0; i < 7 - length; i++) {
            result.append("0");
        }
        return Integer.parseInt(result.toString());
    }
}
