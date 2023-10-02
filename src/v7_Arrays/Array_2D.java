package v7_Arrays;
//7.5
public class Array_2D {
    public static void main(String[] args) {

        String [] [] arr = {
                {"A" , "B" , "c"},
                {"D" , "E"},
                {"F" , "G" , "H" , "I"}
        };

        System.out.println(arr.length);  // get outer array length..
        System.out.println(arr[2].length);  // get inner array length..

//        retrieve elements from 2-D array
        System.out.println(arr[2][0]);
        System.out.println(arr[1][1]);

//        update a value in 2-D element.
       arr[1][0] = "Da";
       arr[2][3] = "Ia";
        System.out.println(arr[1][0]);
        System.out.println(arr[2][3]);

        System.out.println("---------------");

//        how to iterate over 2-D Array using modified 'for' loop.

        for (String [] x : arr){
            for (String  y : x){
                System.out.println(y);
            }
            System.out.println("---------------");
        }

    }
}
