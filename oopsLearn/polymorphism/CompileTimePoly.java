package oopsLearn.polymorphism;

public class CompileTimePoly {
    static  int sum(int a , int b){
        return  a+b;
    }
    static  int sum(int a , int b , int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(90,78));
        System.out.println(sum(8,90,330));
    }
}
