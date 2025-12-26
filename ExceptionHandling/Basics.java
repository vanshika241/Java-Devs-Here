package ExceptionHandling;

public class Basics {
    public static  int divide(int a , int b){
        try{
            return  a/b;
        }
        catch (NullPointerException e){
            System.out.println(e);
            return  -1;
        }
        catch (ArithmeticException e){
            System.out.println(e);
            return  -1;
        }
        catch (Exception e){
            System.out.println(e);
            return  -1;
        }

    }
    public static void main(String[] args) {
        int num[] = {100 , 200 , 300 , 30};
        int denom[] = {2 , 10 , 0 , 3};
        try{
            for(int i=0;i<=10;i++){
                System.out.println(divide(num[i],denom[i]));
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Run successfully");

    }
}
