package  ExceptionHandling;

public  class CallCustomException {
    public static void main(String[] args) {
        ExceptionClass act = new ExceptionClass();
        act.account = 908;
        act.amount = 800;
        try{
            act.withdraw(900);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}