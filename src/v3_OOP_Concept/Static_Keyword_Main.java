package v3_OOP_Concept;

public class Static_Keyword_Main {
    public static void main(String[] args) {
        Static_Keyword sk1 = new Static_Keyword();

        Static_Keyword sk2 = new Static_Keyword();


        sk1.age = 10;
        sk1.grade = "2nd";

        Static_Keyword.name = "Tomy";
        Static_Keyword.name = "bob";
        sk2.age = 12;
        sk2.grade = "3rd";

        sk1.displayDetails();
        sk2.displayDetails();
    }
}
