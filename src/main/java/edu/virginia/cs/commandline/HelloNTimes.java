package edu.virginia.cs.commandline;

/**
 * Command line arguments: an integer
 *
 * Example:
 * 5
 */

public class HelloNTimes {
    public static void main(String[] args) {
        try {
            int count = Integer.parseInt(args[0]);
            printHelloNTimes(count);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Must include a number argument. Example:\n"+
                    "\tjava edu.virginia.cs.commandline.HelloNTimes 5");
        } catch (NumberFormatException e) {
            System.out.println("Error: First argument was not an integer. Example:\n"+
                    "\tjava edu.virginia.cs.commandline.HelloNTimes 5");
        }
    }

    private static void printHelloNTimes(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }
}
