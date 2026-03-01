package chapter1.c1.abc.Lecture20.b;

enum Gender {
    MALE,FEMALE,OTHERS;
    Gender(){

    }
}
class Test{
    public static void main(String[] args) {
        Gender input = Gender.FEMALE;
        if(Gender.MALE.equals(input)){
            System.out.println("you should use Mr.");
        }
        else if(Gender.FEMALE.equals(input)){
            System.out.println("you should use Mrs.");

        }
        else{
            System.out.println("you should not use any salutation salutation");
        }
    }
}