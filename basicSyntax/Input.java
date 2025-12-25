package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       

        //Only next() or nextLine() reads the next line not int and flaot 
        // String name = sc.nextLine();
        // float marks = sc.nextFloat();
        //  int a = sc.nextInt();

        // System.out.println(a);
        // System.out.println(name);
        // System.out.println(marks); 

        //
        // int num = System.in.read(); 
        // System.out.println(num); // it gives ASCII VALUE  - for ex if i enter A it give 65
        // System.out.println(num-48); // It still gives wrong output for bigger number because it only read one character at a time

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int number = Integer.parseInt(bf.readLine()); // bf.readLine() it read the number as string
        System.out.println(number);
        bf.close();
    }
}