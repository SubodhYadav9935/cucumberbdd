package DateChage;

import java.util.Calendar;
import java.util.Date;

public class DAte {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(2019,9,23);
        System.out.println(cal.getTime());
        Date time = cal.getTime();
        System.out.println(time);
        d.getYear();
    }
}
