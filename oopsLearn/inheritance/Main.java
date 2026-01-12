package oopsLearn.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2 , 3 , 4);
        box1.info();
        BoxWeight box2 = new BoxWeight(7 ,4 , 6,  90);
        box2.info();
        Box box3 = new BoxWeight(2,5,6,9);
        //System.out.println(box3.wt); - error

       // BoxWeight box4 = new Box(5,6,7); - you only accessing parent class variables but you didn't initialize child class parameters
    }
}
