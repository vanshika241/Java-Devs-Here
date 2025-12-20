package basicSyntax;

import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        //Widening - Automatically 
        int num = 90;
        long var = num;
        //how to find datatype using inbuilt method (Only for objects)
        String name = "CodeVibes";
        System.out.println(name.getClass().getSimpleName());

        //Narrow 
        long a = 908654364;
        int b = (int)a;
        System.out.println(b);

    }
}
