package v1_Basic_Concept;

public class practice1 {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 400;
        int num3 = 300;

        if (num1 > num2 && num1 > num3){
            System.out.println(num1+"is bigger value");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+"is bigger value");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3+"is bigger value");
        }
    }
}
