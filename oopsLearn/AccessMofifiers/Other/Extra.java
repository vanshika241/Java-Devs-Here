package oopsLearn.AccessMofifiers.Other;

import oopsLearn.AccessMofifiers.ProtectedKeyword;

public class Extra extends ProtectedKeyword {
    int weight;
    public  Extra(int value , String name , int weight){
        super(value , name);
        this.value  = value;
    }
    public  int getValue(){
        return  value;
    }

}

//public static void main(String[] args) {
//    ProtectedKeyword pt = new ProtectedKeyword(9 , "ff");
//    System.out.println(pt.value);
//}