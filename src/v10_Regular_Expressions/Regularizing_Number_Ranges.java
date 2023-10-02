package v10_Regular_Expressions;
//10.10
public class Regularizing_Number_Ranges {
    public static void main(String[] args) {

        // 0-99
        String patt = "[0-9]?[0-9]?";
        String str1 = "99";
        System.out.println(str1.matches(patt));

        System.out.println("----");

        // 0 - 1000
        String patt1 = "[0-9][0-9]?[0-9]?|1000";
        String str2 = "1000";
        System.out.println(str2.matches(patt1));

        System.out.println("----");

        // 99 - 9999
        String patt2 = "99|[1-9][0-9][0-9]?[0-9]";
        String str3 = "9999";
        System.out.println(str3.matches(patt2));

        System.out.println("----");

        //25-75
        String patt3 = "2[5-9]|[3-6][0-9]|7[1-5]";
        String str4 = "29";
        System.out.println(str4.matches(patt3));

        System.out.println("----");

        //220 - 240
        String patt4 ="2[2-3][0-9]|240";
        String str5 = "240";
        System.out.println(str5.matches(patt4));
    }
}
