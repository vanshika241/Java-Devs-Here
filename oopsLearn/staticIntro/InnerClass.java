package oopsLearn.staticIntro;

public class InnerClass {
    static  class  Test{
        int a;
        int b;
        public Test(int a , int b){
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test(1,2);
        Test obj2 = new Test(3,4);
        OutSideTest codeVibes = new OutSideTest("CodeVibes");
        OutSideTest lavi = new OutSideTest("Lavi");
        System.out.println(codeVibes.name);
        System.out.println(lavi.name);

    }
}

class  OutSideTest{
    static  String name;
    OutSideTest(String  name){
        OutSideTest.name = name;
    }
}