package chapter5_6.Question6;

public class Emu {
    static String s = "-";

    public static void main(String[] args) {
        try{
            throw new Exception();

        }catch (Exception e){
            try {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    s+="ic";
                }
                throw new Exception();

            } catch (Exception ex) {
                s+="mc";
            }finally {
                s+="mf";
            }
        }finally {
            s+="of";
        }
        System.out.println(s);
    }
}
