package Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class AuthenticationDemo{
    public static void main(String [] args){
        Predicate<User> p1 = u-> u.getUsername().equals("Subodh")&& u.getPassword().equals("Yadav");
        System.out.println("Enter username");
        Scanner sc = new Scanner(System.in);
        String uName = sc.next();
        System.out.println("Enter password");
        String uPass = sc.next();
        User u = new User(uName,uPass);
        if(p1.test(u)){
            System.out.println("welcome to BBDU");
        }else{
            System.out.println("you are not eligible for this");
        }

    }
}






public class User {
    private String username ;
    private String password;
    public String getUsername(){
        return username;

    }
    public String getPassword(){
        return password;
    }
    User(String userName ,String password){
        this.password=password;
        this.username = userName;

    }
}
