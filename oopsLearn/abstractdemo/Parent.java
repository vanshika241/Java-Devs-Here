package oopsLearn.abstractdemo;

public abstract  class Parent {
    // we can create state members inside parent class and inherit in child class
    abstract  void  career(String name );
    abstract  void  partner(String name);

    void  normal(){
        System.out.println("Normal Method");
    }
      static  void  sayHello(){
        System.out.println("Hii ");
    }
}
