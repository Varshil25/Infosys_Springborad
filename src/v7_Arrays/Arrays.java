package v7_Arrays;
// 7.1
public class Arrays {
    public static void main(String[] args) {
        String [] DaysOfWeek = {"mon", "tue" , "wen" ,"thr", "fri" , "sat" , "sun"};
        int [] num1 = {12,25,36,47,58,69,78,85,99};
        char [] words = {'a','e','i','o','u'};

        System.out.println(DaysOfWeek.length);
        System.out.println(DaysOfWeek[2]);

        DaysOfWeek[2] = "RRR";
        System.out.println(DaysOfWeek[2]);

        for(int i = 0; i <= DaysOfWeek.length - 1; i++){
            System.out.println(DaysOfWeek[i]);
        }
    }
}
