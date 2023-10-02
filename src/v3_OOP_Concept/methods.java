package v3_OOP_Concept;

public class methods {

//   method without arguments.
    public void dothis(){
       System.out.println("Exchange the data");
   }
//   methods with arguments.
   public void addition(int num1, int num2){
       System.out.println(num1 + num2 );
   }

//   method with arguments and return value.
    public int multiply(int num1 , int num2){
        int num3 = num1 * num2;
        return num3;
    }

//    driven code
public static void main(String[] args) {
    methods m = new methods();
    m.dothis();
    m.addition(100,50);
    int x = m.multiply(10,20);
    System.out.println(x);
}
}
