package DateChage;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

class localDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int yy = date.getYear();
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        System.out.println(dd + ":" +mm + ":" + yy);
        System.out.println();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());

    }

}



class  Local{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Clock cl = Clock.systemDefaultZone();
        LocalDate date1 = LocalDate.now(cl);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);


        System.out.println(date1);
        int yy = date.getYear();
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        System.out.println(dd + ":" +mm + ":" + yy);


        System.out.println();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
    }
}


class Local1{
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
//        System.out.println(LocalTime.now().getHour());
        int s = time.getSecond();
        int n = time.getNano();
//        System.out.print("%d-%d-%d-%d",h,m,s,n);
        System.out.println(time);
    }
}


class Period {
    private static Period between;

    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2003, 7, 25);
        LocalDate today = LocalDate.now();
        java.time.Period between = java.time.Period.between(d,today);
        System.out.println(between);
    }

}