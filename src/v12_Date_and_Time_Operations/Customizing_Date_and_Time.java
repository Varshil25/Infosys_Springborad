package v12_Date_and_Time_Operations;
//12.2
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Customizing_Date_and_Time {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2003, 07 ,25);
        LocalDate d2 = LocalDate.of(2003, Month.JULY, 25);
        System.out.println(d1);
        System.out.println(d2);

        LocalTime t1 = LocalTime.of(20,36);
        LocalTime t2 = LocalTime.of(15,25,35);
        LocalTime t3 = LocalTime.of(8,21,32,125);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        LocalDateTime dt1 = LocalDateTime.of(d2,t2);
        System.out.println(dt1);
        LocalDateTime dt2 = LocalDateTime.of(2020,12,31,12,00,00,164);
        System.out.println(dt2);
    }
}
