package v1_Basic_Concept;

public class nested_for {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++){
            for (int j = 1 ;j <= 5 ; j++){
                System.out.println(i+","+j);
            }
            System.out.println("all the iteration of j are done");
        }
    }
}
