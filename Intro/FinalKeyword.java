package oopsLearn.Intro;

public class FinalKeyword {
    public static void main(String[] args) {
        final  int NUMBER = 90;
       // NUMBER = 90;
        final Student lavi = new Student(007 , "Lavi" , 96.4f);
        lavi.name = "Vanshika Chaudhary";
        System.out.println(lavi.name);

    }

    public static class WrapperClass {

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
}

