package oopsLearn.inheritance;

public class Box {
    double l;
    double h;
    double w;
    public Box(double l , double h , double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public  void  info(){
        System.out.println(this.l + " "+this.h + " "+this.w);
    }


}

