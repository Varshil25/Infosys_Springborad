package v12_Date_and_Time_Operations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        /*
        yyyy   - Year
        yy     - year
        MM     - MONTH
        MMM    - MONTH
        dd     - DAY
         */

        String str1 = "25/Jul/03";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MMM/yy][MM-dd-yyyy]");
        LocalDate d1 = LocalDate.parse(str1 , formatter);
        System.out.println(d1);


    }
}
