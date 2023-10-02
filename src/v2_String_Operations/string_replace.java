package v2_String_Operations;

public class string_replace {
    public static void main(String[] args) {
//        Replace - normal
        String str1 = "V123RSHIL P123TEL";
        String str2 = "123";
        String str3 = "A";

        System.out.println(str1.replace(str2,str3));

//        Replace - RegEx
        String str4 = "V$#%AR*(SH^#IL P)^*AT#*EL";
        String patt = "[^A-Za-z0-9\\s]";

        System.out.println(str4.replaceAll(patt,""));
    }
}
