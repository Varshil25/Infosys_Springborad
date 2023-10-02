package v10_Regular_Expressions;
// 10.8
public class RegEx_Exercise1 {
    /*
    www.varshil.com,
    www.varshil.in,
    www.patel.com,
    www.patel.in
     */
    public static void main(String[] args) {
        String patt = "www\\.(varshil|Patel)\\.(com|in)";

        String str1 = "www.varshil.ca";
        System.out.println(str1.matches(patt));
    }
}
