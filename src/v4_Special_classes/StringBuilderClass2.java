package v4_Special_classes;

public class StringBuilderClass2 {
    public static void main(String[] args) {
        String str1 = "hello";
        StringBuilder sb1 = new StringBuilder("Learning is Fun");


//        insert
        sb1.insert(9,"Java ");
        System.out.println(sb1);

//        replace
        sb1.replace(9,13,"Everything");
        System.out.println(sb1);

//        delete
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        sb1.delete(9,13);  // delete(int start , int end).
        System.out.println(sb1);

//        reverse.
        sb1.reverse();
        System.out.println(sb1);


    }
}
