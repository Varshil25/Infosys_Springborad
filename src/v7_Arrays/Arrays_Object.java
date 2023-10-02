package v7_Arrays;
//7.2
public class Arrays_Object {
    public static void main(String[] args) {
        int [] arr1 = new int[10];

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[4] = 40;
        arr1[6] = 60;
        arr1[9] = 100;

        for (int i = 0; i <= arr1.length - 1;i++){
            System.out.println(arr1[i]);
        }
    }
}
