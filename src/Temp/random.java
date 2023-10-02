package Temp;

public class random {

    public static void main(String[] args) {
        String patt = "[0-9][0-9]?";
        String str1 = "100";
        System.out.println(str1.matches(patt));
    }
}
