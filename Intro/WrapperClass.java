package oopsLearn.Intro;

public class WrapperClass {

    public  static  void  swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    }
    public static void main(String[] args) {
        int num = 45;
        Integer a = 89; // object
        Integer b = 90;
        System.out.println(a + " " + b);
        swap(a , b);
        System.out.println(a + " " + b); // Not swapped because its final class


    }
}
