package oopsLearn.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        Circle c = new Circle();
        c.area();
        Sqaure sq = new Sqaure();
        sq.area();
        Triangle t = new Triangle();
        t.area();
        Shapes sq2 = new Sqaure();
        sq2.area();
        sq2.greeting(); // it will not override it only call shape parent class method
    }

}
