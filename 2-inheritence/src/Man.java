public class Man extends Employee{

    private double base;
    public final String NAME="Man";

    Man(double b,int yr,String dep){
        super(yr,dep);
        base = b;
    }

    @Override
    public double calcPay() {
        double pay=base*getYears();
        return pay;
    }

    @Override
    public String toString(){
        return String.format("Man Pay: %f\n",calcPay());
    }
}
