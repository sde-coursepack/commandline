package edu.virginia.cs.commandline;

/**
 * Command line arguments: a name
 *
 * Example:
 * John
 */
public class HelloWho {
    public static void main(String[] args) {
        try {
            String who = args[0];
            System.out.println("Hello, " + who);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No command line arguments");
        }
    }
}
