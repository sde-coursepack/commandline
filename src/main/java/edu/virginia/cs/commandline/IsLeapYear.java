package edu.virginia.cs.commandline;

import java.util.*;

/**
 * Command Line Arguments:
 *
 * Takes in a single number, year
 *
 * Optionally, you can add -j OR --julian to ask if it is a Leap Year in the Julian calendar.
 *
 * Examples:
 *
 * 2022
 * 1900 -j
 * 2500 --julian
 */

public class IsLeapYear {
    public static void main(String[] args) {
        List<String> argList = new ArrayList<>(Arrays.asList(args));
        boolean isJulian = checkForJulianFlag(argList);
        int year = Integer.parseInt(argList.get(0));
        if (isJulian) {
            printJulianLeapYearMessage(year);
        } else {
            printGregorianLeapYearMessage(year);
        }
    }

    private static void printGregorianLeapYearMessage(int year) {
        if (isGregorianLeapYear(year)) {
            System.out.println("On the Gregorian calendar, " + year + " is a leap year");
        } else {
            System.out.println("On the Gregorian calendar, " + year + " is not a leap year");
        }
    }

    private static boolean isEvenlyDivisible(int numerator, int divisor) {
        return numerator % divisor == 0;
    }

    private static boolean isGregorianLeapYear(int year) {
        if (isEvenlyDivisible(year, 400)) {
            return true;
        } else if (isEvenlyDivisible(year, 100)) {
            return false;
        } else {
            return isEvenlyDivisible(year, 4);
        }
    }

    private static void printJulianLeapYearMessage(int year) {
        if (isEvenlyDivisible(year, 4)) {
            System.out.println("On the Julian calendar, " + year + " is a leap year");
        } else {
            System.out.println("On the Julian calendar, " + year + " is not a leap year");
        }
    }

    private static boolean checkForJulianFlag(List<String> argList) {
        return argList.contains("-j") || argList.contains("-julian");
    }


}
