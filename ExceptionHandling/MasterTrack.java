package ExceptionHandling;

public class MasterTrack {


    public static void level3(){
        int arr[] = new int[5];
        arr[5] = 10;
    }

     public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception e){

            e.printStackTrace();
//            StackTraceElement st[] = e.getStackTrace();
//            for(int i=0;i<st.length;i++){
//                System.out.println(st[i]);
//            }
//          System.out.println(e);
        }
//        level1();

        //Output - without try-catch  error propagate in all files
        
    }
}
