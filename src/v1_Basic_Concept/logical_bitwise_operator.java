package v1_Basic_Concept;

public class logical_bitwise_operator {
    public static void main(String[] args) {
        /*
        Logical And -- &&
        Logical Or -- ||
        Logical Not -- !
         */

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);


        /*
        Bitwise And - &
        Bitwise Or - |
        Bitwise Compliment - ~
         */
        int num1 = 60; // 111100
        int num2 = 42; // 101010
        System.out.println(num1 & num2); // 101000 --> 40
        System.out.println(num1 | num2); // 111110 --> 62
        System.out.println(~num1);
        System.out.println(~num2);

    }
}
