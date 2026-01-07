package oops.introduction;

public class FinalKeyword {
    public static void main(String[] args) {
        final  int NUMBER = 90;
       // NUMBER = 90;
        final  Student lavi = new Student(007 , "Lavi" , 96.4f);
        lavi.name = "Vanshika Chaudhary";
        System.out.println(lavi.name);

    }
}

