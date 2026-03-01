package chapter1.c1.abc.Lecture20.b;
// enums , we can declare inside the class but not inside the method
// enum is used to declare user defind custom datatype just like constant in java
class Gnders{
    enum Genders {
        MALE,FEMALE,OTHERS;
        Genders(){

        }
    }
    public static void main(String[] args) {
        Gender input = Gender.FEMALE;
        if(Genders.MALE.equals(input)){
            System.out.println("you should use Mr.");
        }
        else if(Genders.FEMALE.equals(input)){
            System.out.println("you should use Mrs.");

        }
        else{
            System.out.println("you should not use any salutation salutation");
        }
    }
}
