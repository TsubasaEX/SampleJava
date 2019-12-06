import java.util.ArrayList;

public class SimpleArray {

    private ArrayList<Integer> al;

    SimpleArray(){
        al=new ArrayList<Integer>();
        al.add(0);
    }

    public synchronized void addEven(Integer i){
        if(al.get(al.size()-1)%2==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        al.add(i);
        notify();
    }

    public synchronized void addOdd(Integer i){
        if(al.get(al.size()-1)%2==1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        al.add(i);
        notify();
    }

    public void print(){
        System.out.println(al);
    }


}
