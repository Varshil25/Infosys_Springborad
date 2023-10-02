package v2_String_Operations;

public class string_basics {
    public static void main(String[] args) {
        String str1 = "Varshil";
        String str2 = "Patel";

        System.out.println(str1+str2);   // for add two string.
        System.out.println(str1.concat(str2));   // for combine two string
        System.out.println(str1.length());   // for define length of string.
        String str3 = "     Saffrony    Institude      Of Technology   ";
        System.out.println(str3.trim());  // remove beginning and Ending space in String.
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.isEmpty());

        String str4 = "";
        System.out.println(str4.isEmpty());
    }
}
