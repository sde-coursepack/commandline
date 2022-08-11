package edu.virginia.cs.commandline;

/**
 * Command line arguments: a name
 *
 * Example:
 * John
 */
public class HelloWho {
    public static void main(String[] args) {
        String who = args[0];
        System.out.println("Hello, " + who);
    }
}
