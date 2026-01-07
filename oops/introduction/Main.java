package oops.introduction;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 216;
       s1.name = "CodeVibes";
       s1.marks = 97.6f;
       System.out.println(s1.rno + " "+ s1.name + " "+ s1.marks);

       Student s2 = new Student(218 , "Vanshika" , 86);
        System.out.println(s2.rno + " "+ s2.name + " "+ s2.marks);
       Student s3 = new Student(s2);
        System.out.println(s3.rno + " "+ s3.name + " "+ s3.marks);

    }
}

class  Student{
    int rno;
    String name;
    float marks;

     // No args constructor
//    public  Student(){
//
//    }

    // parametrized constructor
    public Student(int rno , String name , float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }

    //copy constructor
    public  Student(Student st){
        this.rno = st.rno;
        this.name = st.name;
        this.marks = st.marks;
    }

    //Constructor chaining
      Student(){
        this(203 , "Stuti" , 87.5f);
    }

    @Override
    protected  void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
    }
}
