package  ExceptionHandling;

public  class FinallyKeyword {

    public  static  int divide(int a , int b){
        try{
            return  a/b;
        }catch (Exception e){
            System.out.println("Exception " + e);
            return  -1;
        }
        finally {
            System.out.println("Your code Successfully run ");
        }
//        System.out.println("Your code Successfully run "); - it will give error
    }
    public static void main(String[] args) {
        System.out.println(divide(1,0));
    }
}