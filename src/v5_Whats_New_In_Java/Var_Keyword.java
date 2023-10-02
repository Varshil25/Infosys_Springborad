package v5_Whats_New_In_Java;

import java.sql.Array;
import java.util.Scanner;

public class Var_Keyword {

    public static void main(String[] args) {
        var num1 = 120;
        var str1 = "Hello";
        var num3 = 12.36;
        Scanner sc = new Scanner(System.in);
        var s2 = new Scanner(System.in);
        var y = add(100,200);
        System.out.println(y);

        int [] arr = new int[10];

        var arr2 = new int[10];

        int [] arr3 = {10,20,30,40,50};

        var arr4 = new int[]{10, 20, 30, 40}; // must be initialized data type
    }

    public static int add(int a , int b)
    {
        return  a +b;
    }
}
