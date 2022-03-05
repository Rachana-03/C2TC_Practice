package Date_and_Time_API;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDate_Demo {

    public static void main(String[] args) {
        //yyyy-mm--dd
        LocalDate today_date = LocalDate.now();
        System.out.println(today_date);

        LocalDate yesterday = today_date.minusDays(1);
        System.out.println(yesterday);

        LocalDate Tommorow = today_date.plusDays(1);
        System.out.println(Tommorow);

        LocalDate x = today_date.plusWeeks(2);
        System.out.println(x);

        LocalDate date1 = LocalDate.of(2018, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(1956, 9, 23);
        System.out.println(date2.isLeapYear());

//    LocalDate d1=LocalDate.of(2022, 2, 1);
//    LocalDateTime Time=d1.atTime(1, 1, 1);
//            //atTime(1,50,0);
//    System.out.println(Time);
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        ZoneId z1 = ZoneId.of("Asia/Calcutta");
        LocalDate d3 = LocalDate.now(z1);
        System.out.println(d3);

        System.out.println("---------------------Crete instance of Localdate----------------------");
        //using of
        LocalDate d1 = LocalDate.of(2022, 2, 1);
        LocalDateTime Time = d1.atTime(1, 1, 1);
        //atTime(1,50,0);
        System.out.println(Time);

        //using   "parse"
        DayOfWeek d2=LocalDate.parse("2022-02-02").getDayOfWeek();
        System.out.println(d2);
        
        int m1=LocalDate.parse("2022-02-03").getDayOfMonth();
        System.out.println(m1);
        
        
        int y1=LocalDate.parse("2022-02-03").getDayOfYear();
        System.out.println(y1);
    }

}
