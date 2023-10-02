package v12_Date_and_Time_Operations;
// 12.5
import java.time.LocalDate;
import java.time.Period;

public class Date_Difference {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(1947,8 ,15);

        Period p = Period.between(d1 , LocalDate.now());
        System.out.println("The Difference is :" + p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days");

        // Total months
        System.out.println(p.toTotalMonths());

    }
}
