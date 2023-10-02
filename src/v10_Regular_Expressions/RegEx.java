package v10_Regular_Expressions;
// 10.1
public class RegEx {
    public static void main(String[] args) {

      String str1 = "+1-687-589#@$%-(1234)";

//      String str = str1.replace("+","").replace("-","").replace()

      String patt = "[^A-Za-z0-9]";

      String str2 = str1.replaceAll(patt, "");
        System.out.println(str2);
    }
}
