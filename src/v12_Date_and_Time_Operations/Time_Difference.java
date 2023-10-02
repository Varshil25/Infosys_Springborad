package v12_Date_and_Time_Operations;

import java.time.Duration;
import java.time.LocalTime;

// 12.6
public class Time_Difference {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(5, 25,36);

        Duration d = Duration.between(t1 , LocalTime.now());
        System.out.println(d);

        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());
    }
}
