package v10_Regular_Expressions;
// 10.4
public class Bracket_Expressions {
    public static void main(String[] args) {

        // Adding literals in bracket [aeiou]
        String patt = "[ABc#485^&*]at";
        String str = "Bat";
        String str1 = "4at";
        String str2 = "#at";
        System.out.println(str.matches(patt));
        System.out.println(str1.matches(patt));
        System.out.println(str2.matches(patt));

        System.out.println("-----");

        // Adding range in bracket [A-Z0-9].
        String patt1 = "[A-Za-z0-9]at";
        String str3 = "Cat";
        String str4 = "cat";
        String str5 = "9at";
        String str6 = "%at";
        System.out.println(str3.matches(patt1));
        System.out.println(str4.matches(patt1));
        System.out.println(str5.matches(patt1));
        System.out.println(str6.matches(patt1));

        System.out.println("-----");

        // Usage of '^' in brackets [^a-z]
        String patt2 = "[^A-Z]at"; // for capital latter's its o/p is false due to range
        String str7 = "Cat";
        String str8 = "9at";
        String str9 = "%at";
        System.out.println(str7.matches(patt2));
        System.out.println(str8.matches(patt2));
        System.out.println(str9.matches(patt2));
    }
}
