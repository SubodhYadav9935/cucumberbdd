package Lambda;

interface SQ{
    int Square(int x);
}

public class Square {
    public static void main(String[] args) {
        SQ s = b -> b*b;
        int c = s.Square(15);
        System.out.println(c);
    }
}
