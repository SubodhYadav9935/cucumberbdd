package chapter1.c1.abc.lecture15;

public class Employee {
    private int empId;
    private String name;
    boolean isContractor = true;
    public String getName() {
        return name;
    }
    public int getEmpId() {
        return empId;
    }

    public boolean isContractor() {
        return isContractor;
    }

    public Employee(int empId, String name, boolean isContractor){
        this.empId=empId;
        this.name=name;
        this.isContractor=isContractor;

    }

    public static void main(String[] args) {
        Employee e1 = new Employee(12,"Aman",false);
        System.out.println(e1.isContractor());
        System.out.println(e1.getEmpId());
        System.out.println(e1.getName());
        Employee e2 = new Employee(13,"Avinash",true);
        System.out.println(e2.isContractor());
        System.out.println(e2.getEmpId());
        System.out.println(e2.getName());

    }
}
