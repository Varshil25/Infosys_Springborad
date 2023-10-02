package v7_Arrays;

public class ArrayOfObject {
    public static void main(String[] args) {

//      Array of Object using 1-D array.
        Object [] arr = {"Varshil" , 21 , 5.9 , 'M'};
        // print array using modified array.
        for (Object x : arr){
            System.out.print(x + " ");
        }

        System.out.println(" \n ---------------------------");
//      Array of Object using 2-D array.
    Object [][] arr1 = {
            {"Urvish" , 26 , 5.11 , 'M'},
        {"Greesa" , 20 , 5.2 , 'F'},
        {"Het" , 19 , 5.6 , 'M'},
        {"Harsh" , 25 , 5.12 , 'M'}
    };
//     print array using modified array.
        for (Object [] x : arr1){
            for (Object y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }
    }
}
