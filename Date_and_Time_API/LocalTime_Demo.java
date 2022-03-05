
package Date_and_Time_API;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


public class LocalTime_Demo {
    public static void main(String[] args) {
        LocalTime curr_time=LocalTime.now();
        System.out.println(curr_time);
        
        int curr2 =LocalTime.parse("09:20").getHour();
        System.out.println(curr2);
        
        LocalTime curr3 =LocalTime.parse("09:20");
        System.out.println(curr3);
        
        LocalTime of =LocalTime.of(9, 3, 30);
        System.out.println(of);
        LocalTime of1 =of.plusMinutes( 30);
        System.out.println(of1);
        LocalTime of2 =of.plusHours(2);
        System.out.println(of2);
        
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);
        System.out.println("");
        
        
        
        
        System.out.println("-------------ZonedDateTime-------------");
        ZoneId z1= ZoneId.of("Asia/Calcutta");
        Set<String>z2 =ZoneId.getAvailableZoneIds();
        z2.forEach(System.out::println);
        
        ZonedDateTime z3=ZonedDateTime.of(LocalDateTime.now(), z1);
        System.out.println(z3);
        
        
    }
}
