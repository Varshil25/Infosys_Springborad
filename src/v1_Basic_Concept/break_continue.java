package v1_Basic_Concept;

public class break_continue {
    public static void main(String[] args) {
        int a = 100;
//        while (a > 50){
//            a -= 5;
//            if (a == 75){
//                break;
//            }
//            System.out.println(a);
//        }

        while (a > 50){
            a -= 5;
            if (a == 75){
                continue;
            }
            System.out.println(a);
        }
    }
}
