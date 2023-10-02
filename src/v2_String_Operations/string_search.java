package v2_String_Operations;

public class string_search {
    public static void main(String[] args) {
        String str1 = "I love Java and Springboot";
        String str2 = "Java";
        String str3 = "Python";

        // contains method
        System.out.println(str1.contains(str2));
        System.out.println(str1.contains(str3));

        // starts with
        System.out.println(str1.startsWith("I"));

        // Ends with
        System.out.println(str1.endsWith("Springboot"));
        System.out.println(str1.endsWith("Springboot1"));

        //index of
        System.out.println(str1.indexOf("love"));
        System.out.println(str1.indexOf("love",1 ));

        // lastIndex of
        System.out.println(str1.lastIndexOf("love"));

    }
}
