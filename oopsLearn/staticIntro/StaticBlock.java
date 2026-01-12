package oopsLearn.staticIntro;

public class StaticBlock {
    static int  a  = 4;
    static  int b;
    static{
        System.out.println("I am in static block");
        b = a*3;
    }

    public static void main(String[] args) {
       StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
        StaticBlock.b += 2;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(a);
        System.out.println(b);
    }
}
