package v10_Regular_Expressions;
//10.2
public class Quantifiers {
    public static void main(String[] args) {

        // * Quantifiers
        String patt = "abc*";
        String str1 = "abc";
        String str2 = "ab";
        String str3 = "abccc";
        System.out.println(str1.matches(patt));
        System.out.println(str2.matches(patt));
        System.out.println(str3.matches(patt));

        System.out.println(" ---- ");

        // + Quantifiers
        String patt1 = "abc+";
        String str4 = "abc";
        String str5 = "abccc";
        String str6 = "ab";
        System.out.println(str4.matches(patt1));
        System.out.println(str5.matches(patt1));
        System.out.println(str6.matches(patt1));

        System.out.println(" ---- ");

        // ? Quantifiers
        String patt2 = "abc?";
        String str7 = "ab";
        String str8 = "abc";
        String str9 = "abcc";
        System.out.println(str7.matches(patt2));
        System.out.println(str8.matches(patt2));
        System.out.println(str9.matches(patt2));

        System.out.println(" ---- ");

        // {n}
        String patt3 = "ab(xyz)*";
        String patt4 = "ab(xyz)+";
        String patt5 = "ab(xyz)?";

        String str10 = "ab";
        String str11 = "abxyz";
        String str12 = "abxyzxyz";
        System.out.println(str10.matches(patt3));
        System.out.println(str11.matches(patt3));
        System.out.println(str12.matches(patt3));
        System.out.println("--");
        String str13 = "ab";
        String str14 = "abxyz";
        String str15 = "abxyzxyz";
        System.out.println(str13.matches(patt4));
        System.out.println(str14.matches(patt4));
        System.out.println(str15.matches(patt4));
        System.out.println("--");
        String str16 = "ab";
        String str17 = "abxyz";
        String str18 = "abxyzxyz";
        System.out.println(str16.matches(patt5));
        System.out.println(str17.matches(patt5));
        System.out.println(str18.matches(patt5));

        System.out.println(" ---- ");

        String patt6 = "ab(xyz){2}";
        String str19 = "abxyz";
        String str20 = "abxyzxyz";
        String str21 = "abxyzxyzxyz";
        System.out.println(str19.matches(patt6));
        System.out.println(str20.matches(patt6));
        System.out.println(str21.matches(patt6));

        System.out.println(" ---- ");

        // {n,m}
        String patt7 = "ab(xyz){2,6}";
        String str22 = "abxyz";
        String str23 = "abxyzxyz";
        String str24 = "abxyzxyzxyz";
        System.out.println(str22.matches(patt7));
        System.out.println(str23.matches(patt7));
        System.out.println(str24.matches(patt7));

        System.out.println(" ---- ");

        // {n,}
        String patt8 = "ab(xyz){2,}";
        String str26 = "abxyz";
        String str27 = "abxyzxyz";
        String str28 = "abxyzxyzxyz";
        System.out.println(str22.matches(patt8));
        System.out.println(str23.matches(patt8));
        System.out.println(str24.matches(patt8));



    }

}
