package chapter1.c1.abc.Lecture20.b;

public enum RideCategories {
    JUNIOR(12),TEENAGER(17),ADULT(35);
    private int age;
    RideCategories(int i){
        this.age=i;
    }
    public int getAge(){
        return age;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        RideCategories[] rcategory = RideCategories.values();
        for(RideCategories rc : rcategory){
            System.out.println("riders with age upto"+rc.getAge()+"fall into"+rc.name()+"group");
        }
    }
}
