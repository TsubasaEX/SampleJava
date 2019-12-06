import java.util.ArrayList;

public class Odd implements Runnable{

    private SimpleArray ary;
    private int count = 1;
    Odd(SimpleArray a){
        ary=a;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            try{
                ary.addOdd(count);
                count += 2;
                Thread.sleep(10);
            }catch(Exception ex) {
            }
        }
    }
}
