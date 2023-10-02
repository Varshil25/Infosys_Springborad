package v2_String_Operations;

public class string_Slice {
    public static void main(String[] args) {
//        for interview
       String str1 = "VARSHIL PATEL";
       String temp = "";
//        System.out.println(str1.length());
       for (int i = 0; i <= str1.length() -1 ; i++){
           temp = str1.charAt(i) + temp;
       }
        System.out.println(temp);

//          charAt
        System.out.println(str1.charAt(5));

//          substring
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,6)); // endindex with -1 index...

//          split
        String str2 = "A_B_C_D";
        String str3 = "_";

        String [] arr = str2.split(str3);

        for (String x : arr){
            System.out.println(x);
        }

    }
}
