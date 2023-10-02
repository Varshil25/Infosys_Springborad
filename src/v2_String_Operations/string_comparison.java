package v2_String_Operations;

public class string_comparison {
    public static void main(String[] args) {
       String str1 = "ABCDE";
       String str2 = "ABCDE";
       String str3 = "ABCDe";

       // Equals methods
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        // CompareTo methods
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str3));

        // matches
        String patt = "[A-Z]{1,}";
        System.out.println(str1.matches(patt));
    }
}
