package v12_Date_and_Time_Operations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// 12.3
public class FuturePastDate {
    public static void main(String[] args) {
        // Future Date
        LocalDate d1 = LocalDate.now().plusMonths(3);
        System.out.println(d1);

        // Past Date.
        LocalDate d2 = LocalDate.now().minusMonths(3);
        System.out.println(d2);

        // ChronoUnit
        LocalDate d3 = LocalDate.now().minus(10, ChronoUnit.DECADES);
        LocalDate d4 = LocalDate.now().plus(10, ChronoUnit.DECADES);
        System.out.println(d3);
        System.out.println(d4);

    }
}
