package chapter1.c1.abc.cde;
public class Professor {
    private String department ;
    private int salary ;
    private String educationQualification;
    public String getDepartment(){  // this method is accessible outside the class
        return department;
    }
    private int getSalary() {  // this method is not accessible outside the class
        return salary;
    }
    public String getEducationQualification(){
        return educationQualification;
    }
    public Professor(String dept,int salary,String education){ // constructor which initializes the three value
        this.department=dept;
        this.salary= salary;
        this.educationQualification=education;
    }
    public Professor(String dept,String education){ // constructor which initializes the two value
        this.department=dept;
        this.educationQualification=education;
    }
    public Professor(){} // it is no argument constructor
}
