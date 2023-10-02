package v1_Basic_Concept;

public class nested_if_condition {
    public static void main(String[] args) {
        int marks = 99;

        if (marks > 90){
            System.out.println("A Grade");
        } else if (marks >= 75){
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 40) {
            System.out.println("D Grade");
        }else if (marks < 40){
            System.out.println("Fail");
        }
    }
}
