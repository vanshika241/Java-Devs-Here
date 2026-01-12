package oopsLearn.staticIntro;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(18 , "Lavi" , 10000 , false);
        Human h2 = new Human(45 , "Shalu" , 100000 , true);
        System.out.println(h1.name);
        System.out.println(h2.name);
        System.out.println(Human.population);
//        System.out.println(h1.population);
//        System.out.println(h2.population);

        greeting();
        Main obj = new Main();
        obj.hello();
    }
   static void greeting(){
        System.out.println("Good Morning");
    }

    void hello(){
        System.out.println("Hello");
        greeting();
    }

}
