package oopsLearn.inheritance;

public class Square extends  Box{
    String name ;
    public  Square(double l , double h , double w , String name ){
        super(l , h , w);
        this.name = name;
    }
    public  void  info(){
        System.out.println(this.l + " "+this.h + " "+this.w + " "+this.name);
    }

}
