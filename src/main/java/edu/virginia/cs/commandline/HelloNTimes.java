package edu.virginia.cs.commandline;

/**
 * Command line arguments: an integer
 *
 * Example:
 * 5
 */

public class HelloNTimes {
    public static void main(String[] args) {
        int count = getCount(args);
        printHelloNTimes(count);
    }

    private static int getCount(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Error: you must include an integer argument");
        }
        return Integer.parseInt(args[0]);
    }

    private static void printHelloNTimes(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }
}
