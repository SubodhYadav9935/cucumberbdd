package chapter5_6.video5AllInOne;

public class TasteFood {
    public static void main(String[] args) {
        try{
            checkFood(args[0]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void checkFood(String food) {
        if(food.equals("dosa")){
            System.out.println("I like");
        } else if (food.equals("Biriyani")) {
            throw new BadFoodException("I am south indian I don't like north indian food");
            
        }
    }
}
