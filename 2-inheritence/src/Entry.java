

public class Entry {

    public static void main(String[] args){
        System.out.println("entry");

        Man man = new Man(5.5,100,"QA");
//        double d = Double.parseDouble("11.11");
//        int n = Integer.parseInt("11");
//        System.out.println(d);
//        System.out.println(n);
        System.out.println(man.calcPay());

        Woman woman = new Woman(6.6,100,"AE");
//        double d = Double.parseDouble("11.11");
//        int n = Integer.parseInt("11");
//        System.out.println(d);
//        System.out.println(n);
        char c='c';
        float f = 10.2f;
        System.out.println(c);
        System.out.println(f);

        System.out.println(woman.calcPay());

        EmployTemp[] eps = new Employee[2];
        eps[0]=man;
        eps[1]=woman;

        for(EmployTemp ep:eps) {
            System.out.println(ep.calcPay());
            System.out.println(ep);
        }

        Man pman = (Man) eps[0];//downcasting
        System.out.println(pman);
        System.out.println(pman.NAME);

    }
}
