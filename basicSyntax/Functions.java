package basicSyntax;

public class Functions {

    public static void sayHello(){
        System.out.println("Hello CodeVibes");
    }

    public static int add(int a , int b){
        return a+b;
    }



    public static void main(String[] args) {
        sayHello();
        int sum = add(4, 8);
        System.out.println(sum);
        //In java the functions are pass by value 100 % not pass by reference because they copy the value whether its object or primitive variable and send to the function parameters and execute the function
    }
}
