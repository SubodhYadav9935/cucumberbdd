package chapter5_6.video1;

import java.io.IOException;

class Test2 {
    public static void main(String[] args) {
        System.out.println(10/0); // implicit exception
    }
}
class test{
    public static void main(String[] args) {
        throw new RuntimeException("/ by zero"); // explicitly programmer throws it
    }
}
class Test1{
    public static void main(String[] args) throws Exception{
        throw new IOException("I am Playing flute because my java prip done");
    }
}
