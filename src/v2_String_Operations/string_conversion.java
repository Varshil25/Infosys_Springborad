package v2_String_Operations;

public class string_conversion {
    public static void main(String[] args) {
        int num1 = 100;

        System.out.println(Integer.toString(num1));       // toString
        System.out.println(Integer.toBinaryString(num1)); // toBinaryString
        System.out.println(Integer.toOctalString(num1));  // toOctalString
        System.out.println(Integer.toHexString(num1));    // toHexString

//        parseInt
        String str1 ="100";
        String str2 = "101010";
        String str3 = "64";
        String str4 = "144";

        System.out.println(Integer.parseInt(str1));
        System.out.println(Integer.parseInt(str2,2));
        System.out.println(Integer.parseInt(str3,16));
        System.out.println(Integer.parseInt(str4,8));
    }
}
