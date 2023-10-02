package v10_Regular_Expressions;
// 10.5
public class Or_Operator {
    public static void main(String[] args) {
//        OR operator [|]
        String patt = "a(b|c|d|123)";
        String str1 = "a123";
        String str2 = "ab";
        String str3 = "abc";
        System.out.println(str1.matches(patt));
        System.out.println(str2.matches(patt));
        System.out.println(str3.matches(patt));
    }
}
