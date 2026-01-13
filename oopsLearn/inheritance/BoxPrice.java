package oopsLearn.inheritance;

public class BoxPrice extends  BoxWeight {
    int price;
    public  BoxPrice(double l , double h , double w , double wt , int price){
        super(l,h,w,wt);
        this.price = price;
    }
    @Override
    public  void  info(){
        System.out.println(this.l + " "+this.h + " "+this.w + " "+this.wt + " "+this.price);
    }

}
