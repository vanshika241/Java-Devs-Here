package basicSyntax;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        //Only next() or nextLine() reads the next line not int and flaot 
        String name = sc.nextLine();
        float marks = sc.nextFloat();
         int a = sc.nextInt();

        System.out.println(a);
        System.out.println(name);
        System.out.println(marks); 

    }
}