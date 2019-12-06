import java.util.ArrayList;

public class Even implements Runnable{

    private SimpleArray ary;
    private int count = 2;
    Even(SimpleArray a){
        ary=a;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                ary.addEven(count);
                count += 2;
                Thread.sleep(10);
            }catch(Exception ex) {
            }
        }
    }

}
