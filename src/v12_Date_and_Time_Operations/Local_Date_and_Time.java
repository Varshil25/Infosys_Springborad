package v12_Date_and_Time_Operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// 12.1
public class Local_Date_and_Time {
    public static void main(String[] args) {
        // How to get current date?
        System.out.println(LocalDate.now());

        // How to get current Time?
        System.out.println(LocalTime.now());

        // How to get Current date and time?
        System.out.println(LocalDateTime.now());
    }
}
