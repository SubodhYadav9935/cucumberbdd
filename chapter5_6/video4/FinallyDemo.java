package chapter5_6.video4;

import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) throws IOException{
        FinallyDemo obj = new FinallyDemo();
        obj.m1();
    }

    private void m1() throws IOException{
        try{
             throw new IOException();
        }finally {
            System.out.println("finallly block executes");
        }
    }
}
