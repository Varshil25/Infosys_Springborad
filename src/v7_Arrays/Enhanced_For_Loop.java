package v7_Arrays;
// 7.3
import java.util.Scanner;

public class Enhanced_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();

        int [] arr = new int[10];
        for (int i =1 ; i<=10 ; i ++){
            arr[i-1] = num * i;
        }

        // Enhanced for loop to print each element of the array
        for (int n : arr){
            System.out.println(n);
        }


    }
}
