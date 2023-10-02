package v8_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Array_List {
    public static void main(String[] args) {
//      format of Arraylist declaration.
        ArrayList<String> arr = new ArrayList<String>();

//      ArrayList implements List Interface.
        List<String> arr1 = new ArrayList<String>(0);

//      Add a Data in List
        arr.add("Red");
        arr.add("White");
        arr.add("Black");
        arr.add("Blue");
        arr.add("Pink");
        arr.add("Purple");
        arr.add("Brown");
        arr.add("Yellow");

//      Get a Data from a List
        System.out.println("List Elements :" + arr);
        System.out.println(arr.get(3));

//      clear all list.
     /*
        arr.clear();
        System.out.println(arr);
      */

//       Remove in List.
    /*
        arr.remove(3);
        System.out.println("List Elements :" + arr);
    */

//    Update in list
        arr.set(3,"Black");
        System.out.println("List Elements :" + arr);

        System.out.println(arr.indexOf("Black"));
        System.out.println(arr.lastIndexOf("Black"));

//     check any value is present in list than use contain
        System.out.println(arr.contains("White"));
        System.out.println(arr.contains("English color"));

//      Create a Sublist of list
        System.out.println(arr.subList(2 , 5));


//      check list is empty or not.
        System.out.println(arr.isEmpty());
        System.out.println(arr1.isEmpty());

//      find a list size.
        System.out.println(arr.size());
        System.out.println("List Elements :" + arr);

        System.out.println("--------");

//       Iterative over list.
        for (String x : arr){
            System.out.println(x);
        }




    }
}
