package com.packtpub.testing;

public class TempConverter {
    public static double convertToF(double degreesC) {
        double degreesF = (degreesC * 9/5) + 32;
        return Math.round(degreesF * 10.0) / 10.0;
    }
}
