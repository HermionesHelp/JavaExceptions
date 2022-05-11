package com.company;

public class MyFileUtils {

    public static int subtract10FromLargerNumber (int number) throws Exception {
        if (number < 10) {
            throw new Exception("Cannot subtract 10 from this number. Try a larger number.");
        }
        return number -10;
    }
}
