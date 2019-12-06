import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Entry {

    public static void main(String []args){
        SimpleArray sary=new SimpleArray();
        Even even = new Even(sary);
        Odd odd = new Odd(sary);
        Thread t2 = new Thread(even);
        Thread t1 = new Thread(odd);
//        t2.start();
//        t1.start();
        ExecutorService exs = Executors.newCachedThreadPool();
        exs.execute(t2);
        exs.execute(t1);
        try{
            Thread.sleep(2000);
            sary.print();
        }catch(Exception ex){
        }
        exs.shutdown();
    }
}
