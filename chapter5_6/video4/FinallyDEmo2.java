package chapter5_6.video4;

import java.io.IOException;

public class FinallyDEmo2 {
    public static void main(String[] args) throws IOException {
        FinallyDEmo2 obj = new FinallyDEmo2();
        obj.m1();
    }

    private void m1() throws IOException{
        try{
            throw new IOException();
        }
        catch(Exception e){
            throw new IOException();

        } finally{
            System.out.println("finallly block executes");
        }
    }
}
