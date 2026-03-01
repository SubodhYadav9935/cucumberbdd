package chapter1.c1.abc.Lecture21;

public enum Color {
    RED,YELLOW,GREEN;
    Color (){
        System.out.println("constructor got called ");
    }

    public static void main(String[] args) {
        System.out.println("Hey");
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        Color c = Color.RED;
    }
}