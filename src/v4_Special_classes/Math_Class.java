package v4_Special_classes;

public class Math_Class {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;

//      Math.min() , Math.max() , Math.PI , Math.E
        System.out.println("Minimum number is :" + Math.min(num1 , num2));
        System.out.println("Maximum number is :" + Math.max(num1 , num2));
        System.out.println("Value of PI :" + Math.PI);
        System.out.println("Value of E : " + Math.E);

        System.out.println("----------------------------------------------------------");

//      Math.pow(number , power) , Math.sqrt(number) , Math.cbrt(number)
        System.out.println(Math.pow(2 , 10));
        System.out.println(Math.sqrt(200));
        System.out.println(Math.cbrt(300));

        System.out.println("----------------------------------------------------------");


//       Math.ceil() , Math.floor() , Math.round()
        double x = 12.98;
        double y = 10.08;
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));

        System.out.println("----------------------------------------------------------");


//       Math.sin() , Math.cos() , Math.tan() , Math.log10()
        System.out.println(Math.sin(y));
        System.out.println(Math.cos(x));
        System.out.println(Math.tan(x));
        System.out.println(Math.log10(100));
        System.out.println(Math.log(100));

        System.out.println("----------------------------------------------------------");

//        Math.random().
        System.out.println(Math.random()); // Generate a value in between 0 to 1.
    }
}
