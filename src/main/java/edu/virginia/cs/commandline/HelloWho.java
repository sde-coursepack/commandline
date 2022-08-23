package edu.virginia.cs.commandline;

/**
 * Command line arguments: a name
 *
 * Example:
 * John
 */
public class HelloWho {
    public static void main(String[] args) {
        if (args.length == 0) {
            String who = args[0];
            System.out.println("Hello, " + who);
        } else {
            System.out.println("Error: No command line arguments");
        }
    }
}
