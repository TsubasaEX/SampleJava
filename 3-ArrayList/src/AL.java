import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL {

    public static void main(String[] args){

        ArrayList<Integer> AI = new ArrayList<Integer>();
        AI.add(10);
        AI.add(20);
        AI.add(30);
        AI.add(1);
        AI.add(2);
        System.out.println(AI);
        System.out.println(AI.size());
        Integer I=AI.get(1);
        System.out.println(I);
        Collections.sort(AI);
        System.out.println(AI);
        Collections.sort(AI,Collections.reverseOrder());
        System.out.println(AI);
//        String[] strArray1 = new String[] {"A","B","C"};
//        String[] strArray2 = {"A","B","C"};
        String[] strs = new String[] {"A","G","C","B","H","W"};
        Arrays.sort(strs,Collections.reverseOrder());
//        Arrays.sort(strs);
        for(String str:strs){
            System.out.println(str);
        }
        Arrays.sort(strs,Collections.reverseOrder());
        for(String str:strs){
            System.out.println(str);
        }
    }

}
