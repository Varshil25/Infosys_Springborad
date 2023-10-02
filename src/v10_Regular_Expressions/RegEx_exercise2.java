package v10_Regular_Expressions;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 10.9
public class RegEx_exercise2 {
    /*
    Create a RegEx pattern  to extract all prices from a string
    e.g., "Your total cost is $24.9 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount"
    RegEx pattern should be able to match all prices from the above string.
     */
    public static void main(String[] args) {
        String str1 = "Your total cost is $24.9 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount";

        String patt = "\\${1}\\d{1,}\\.\\d{1,}";

        Pattern p = Pattern.compile(patt);
        Matcher m = p.matcher(str1);

        while (m.find()){
            //System.out.println(m.start());
            System.out.println(m.group());
        }
    }
}
