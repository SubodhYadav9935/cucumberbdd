package chapter1.c1.abc.Lecture20.c;
enum Color {
    RED("Danger"),YELLOW("Warning"),GREEN("Safe");
    String description;
    Color(String desc){
         this.description=desc;
    }

    public String getDescription() {
        return description;
    }
}
class Test{
    private Color c;
    private String name;

    public static void main(String[] args) {
        for(Color c: Color.values()){
            System.out.println(c.getDescription());

        }
    }
}
