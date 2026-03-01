package chapter1.c1.abc.Lecture23.b;

public class Student {
    private int rollNo;
    private String name;
    private String address;
    public Student(int rollNo,String name,String address){
        this.name=name;
        this.address=address;
        this.rollNo=rollNo;
    }
    public College getCollege(){  //college is user defines datatype
        College z =  new College();
        z.setcName("HSBC");
        z.setAddress("London");
        return z;
    }
    public Student getStudent(){
        return new Student(12,"Amit","Ahemdabad");
    }
    public String getName(){
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getAddress() {
        return address;
    }
    public void prepareForExam(){
        System.out.println("make books as pillow to absorb the knowledge");
        return;
    }

}
class College{
    private String cName;
    private String address;
    public void setcName(String name){
        this.cName=name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getcName() {
        return cName;
    }

    public String getAddress() {
        return address;
    }
}
class Test{
    public static void main(String[] args) {
        Student st = new Student(12,"Suman","India");
        College c = st.getCollege();
        System.out.println(c.getAddress());
        System.out.println(c.getcName());
        System.out.println(st.getAddress());
        System.out.println(st.getName());
        System.out.println(st.getRollNo());
    }
}
