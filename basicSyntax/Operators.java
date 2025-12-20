package basicSyntax;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Arithmrtic Operator");
        int a = 9;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a % b);

        System.out.println("Unary Operator");
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++b);
        System.out.println(--b);

        System.out.println("Assignmet Operator");
        System.out.println(a+=3);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a %=b);

        System.out.println("Logical Operator");
        System.out.println(true && true);
        System.out.println(true && false);
         System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(!true);

        a = 89;
        a = 78;
        System.out.println("Relational Operator");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a != b);

        a = 10;
        b = 4;

        System.out.println("Binary Operator");
        System.out.println(a & b );
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a >> 2);
        System.out.println(a << 2);




    }
}
