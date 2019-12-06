
class WW{
    public int wn;
    WW(int w){
        wn=w;
    }
}


public class Woman extends Employee{

    private double base;
    public final String NAME="Woman";

    Woman(double b,int yr,String dep){
        super(yr,dep);
        base = b;
        WW ww = new WW(yr);
        System.out.println(ww.wn);
        System.out.println(ww);
    }

    @Override
    public double calcPay() {
        double pay=base*getYears();
        return pay;
    }

    @Override
    public String toString(){
        return String.format("Woman Pay: %f\n",calcPay());
    }
}
