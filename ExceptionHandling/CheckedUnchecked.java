package  ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public  class CheckedUnchecked {
    public static void main(String[] args) throws FileNotFoundException {

        //Checked Exception
        //FileReader file = new FileReader("a.txt");

        //throw keyword
        try{
            FileReader file = new FileReader("a.txt");
        }catch (Exception e){
            System.out.println("File not found");
            throw new FileNotFoundException("OOPS! Nahi mili ");
        }

        //Unchecked Exception
        int a = 90;
        int b = 0;
        System.out.println(a/b); // it will show at Run time
    }
}