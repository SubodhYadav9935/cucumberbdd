package chapter5_6.video5AllInOne;

public class SocialMediaRegistration {
    public static void main(String[] args) {
        SocialUser smr=new SocialUser();
        try{
            int age = Integer.parseInt(args[0]);
            if(smr.getAge()<18){
                throw new TooYoungException("You are too young to open social media account ");
            }if(smr.getAge()>80){
                throw new TooOldException("It's a time to meet god");
            }
        }catch (Throwable e){
            Registry.handleException(e);
        }
    }


}
