package org.levelup.lession2;

public class CastExamples {
    public static void main(String[] args) {
        int intValue = 15;
        double doubleValue = 12.265135;
        long longValue = intValue;
        float floatValue;
        floatValue = (float) doubleValue;

        int result = (int)(intValue + longValue);
    }
}
