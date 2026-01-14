package oopsLearn.AccessMofifiers;

public class PrivateKeyword {
    private  int age;
    String name;
    public  PrivateKeyword(int age , String  name){
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
