package Lambda;


@FunctionalInterface
interface I23{
    public int getLength(String s);
}
class H {
     public static void main(String[] args) {
         I23 i = s -> s.length();
          int j = i.getLength("Aman");
         System.out.println(j);
     }
}
