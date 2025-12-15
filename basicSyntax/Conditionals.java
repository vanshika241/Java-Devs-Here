package basicSyntax;

public class Conditionals {
    public static void main(String[] args) {
        
        //decision making - condition 
        //if block
        int num = 89;
        if(num>50){
            System.out.println("Large Number");
        }


        int age = 90;
        //if else 
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote");
        }

        //Nested 
        if(age<=12){
            System.out.println("Child");
        }
        else if (age>12 && age<18) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid ");
                break;
        }

    }
}
