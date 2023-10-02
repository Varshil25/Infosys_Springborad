package v10_Regular_Expressions;
// 10.6
public class Dot_Operator {
    public static void main(String[] args) {
        // Dot operator '.' -> Matches any Single character.

//        dot character fulfill any character in String.
        String patt = "ABC.";
        String str = "ABC9";
        String str1 = "ABC*";
        System.out.println(str.matches(patt));
        System.out.println(str1.matches(patt));

        System.out.println("-----");  // also we can apply quantifiers.

        String patt1 = "ABC.*";
        String str2 = "ABCdagyhg525%4^";
        System.out.println(str2.matches(patt1));
    }
}
