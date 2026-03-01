package chapter1.c1.abc;
public class Student {
    private int marks;
    private String address;

    public int getMarks() {
        return marks;
    }
    private String getAddress(){
        return address;
    }
    public Student(int marks,String address){
        this.marks=marks;
        this.address=address;
    }
    public Student(int marks){
        this.marks=marks;
    }
    public Student(){}

}



