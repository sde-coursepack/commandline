package edu.virginia.cs.commandline;

/**
 * Command line arguments: two integer numbers
 *
 * Example:
 * 144 81
 */

public class MyGCD {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int gcd = gcd(a,b);
        String toPrint = String.format("GCD(%d, %d) = %d", a, b, gcd);
        System.out.println(toPrint);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int temp = b;
        b = a % b;
        a = temp;
        return gcd(a, b);
    }
}
