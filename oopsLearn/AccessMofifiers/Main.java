package oopsLearn.AccessMofifiers;

public class Main {
    public static void main(String[] args) {
        PrivateKeyword obj1 = new PrivateKeyword(3,"CodeVibes");
        obj1.setAge(20);
        System.out.println( obj1.getAge());
        PublicKeyword obj2 = new PublicKeyword(8);
        System.out.println(obj2.num);
        ProtectedKeyword obj3 = new ProtectedKeyword(4 , "Lavi");
        System.out.println(obj3.value);
    }
}
