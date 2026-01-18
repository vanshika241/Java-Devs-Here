package oopsLearn.abstractdemo;


public class Son extends  Parent{

    @Override
    void  career(String name){
        System.out.println("Mera beta  bangea" +name);
    }

    @Override
    void partner(String name){
        System.out.println("Abhi nahi pta mujhe kon hai vo kadooos" +name);
    }
}
