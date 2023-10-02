package v12_Date_and_Time_Operations;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// 12.4
public class FuturePastTime {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now().minusHours(5);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now().plusHours(5);
        System.out.println(t2);

        LocalTime t3 = LocalTime.now().plus(5, ChronoUnit.HOURS);
        System.out.println(t3);

        LocalTime t4 = LocalTime.now().minus(10 , ChronoUnit.SECONDS);
        System.out.println(t4);
    }
}
