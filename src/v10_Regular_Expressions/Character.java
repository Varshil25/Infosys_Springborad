package v10_Regular_Expressions;
//10.3
public class Character {
    public static void main(String[] args) {

        // \d - matches a single digit character.
        String patt = "\\d{3}";
        String str1 = "233";
        System.out.println(str1.matches(patt));

        // \w - matches a single word character.
        String patt1 = "\\w";
        String str2 = "a";
        System.out.println(str2.matches(patt1));

        // \s - matches a single whitespace character.
        String patt2 = "\\s";
        String str3 = " ";
        System.out.println(str3.matches(patt2));

        // \D - matches a single non-digit character. apart from digit we can use all character.
        String patt3 = "\\D{2,9}";
        String str4 = "A$%#^&bs";
        System.out.println(str4.matches(patt3));

        // \W - matches a single non-digit and non-word character, only purpose is us represent a special character.
        String patt4 = "\\W{2,9}";
        String str5 = "@#$%^&*";
        System.out.println(str5.matches(patt4));

    }
}

