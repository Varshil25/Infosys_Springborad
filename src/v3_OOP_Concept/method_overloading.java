package v3_OOP_Concept;

public class method_overloading {

    public void addition(int num1 , int num2){
        System.out.println(num1 + num2);
    }

    public void addition(int num1 , int num2 , int num3){
        System.out.println(num1 + num2 +num3 );
    }

    public void addition(double num1 , double num2){
        System.out.println(num1 + num2);
    }

    public void addition(int num1 , double num2){
        System.out.println(num1 + num2);
    }

    public void addition(double num1 , int num2){
        System.out.println(num1 + num2);
    }


    public static void main(String[] args) {
        method_overloading mo = new method_overloading();
        mo.addition(10,20);
        mo.addition(10,20,30);
        mo.addition(10,12.3);
        mo.addition(10.5,19.5);
        mo.addition(10.5,2);
    }
}
