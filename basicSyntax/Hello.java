package basicSyntax;


public class Hello { // main class name should be same as file name 

    public static void main(String[] args) { // start point of java program - java program start executing from here 
        System.out.println("Hello CodeVibes"); // System - class , out - object , println() - printstream method
        System.out.println("I want to become a Java developer");


        //System.out.println() working ?
        /* 
        When you call System.out.println(), you’re actually working with an instance of the PrintStream class. The System class, which is part of java.lang, defines System.out as a static final variable:

        public final class System {
    public static final PrintStream out = ...;
}

This means System.out is a shared instance of PrintStream, which provides methods like print(), println(), and printf().


 
*/

    }
}
