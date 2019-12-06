public abstract class Employee implements EmployTemp{

    private int years;
    private String department;

    Employee(int yr,String dep){
        years=yr;
        department=dep;
    }

    int getYears(){
        return years;
    }
}
