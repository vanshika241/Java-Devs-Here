package oopsLearn.inheritance;

public class BoxWeight extends  Box{
    double wt;

    public  BoxWeight(double l , double h , double w , double wt){
        super(l , h , w);
        this.wt = wt;
    }
    @Override
    public  void  info(){
        System.out.println(this.l + " "+this.h + " "+this.w + " "+this.wt);
    }

}
