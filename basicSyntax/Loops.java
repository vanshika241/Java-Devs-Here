package basicSyntax;

public class Loops {
    public static void main(String[] args) {
        
        //for loop
        for(int i=0;i<5;i++){
            System.out.println("Hello CodeVibes");
        }

        //while loop
        int j = 0;
        while (j<5) {
            System.out.println("I want to become a Java Developer");
            j++;
        }

        //do while loop
        int k = 0;
        do{
            System.out.println("Hii there");
            k++;
        }while(k<5);

        //break keyword
        for(int i=0;i<5;i++){
            if(i>=3)break;
            System.out.println("Break Statement");
        }

        //continue keyword
        for(int i=0;i<5;i++){
            if(i == 3)continue;
            System.out.println("Continue statement");
        }
    }
}
