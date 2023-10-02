package v4_Special_classes;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("please enter a String");
        String str1 = sc.nextLine();
        String temp = "";

        for (int i = 0; i <= str1.length()-1 ; i++){
            temp = str1.charAt(i) + temp;
        }
        System.out.println(temp);
    }
}
