package v3_OOP_Concept;

public class Road_Toll {
    String type;
    int tiresCount;

    public void calculateToll(){
        if (tiresCount == 2){
            System.out.println("Your toll amount is 0");
        } else if (tiresCount == 4) {
            System.out.println("Your toll amount is 10");
        } else if (tiresCount > 4) {
            System.out.println("Your toll amount is 20");
        } else {
            System.out.println("Incorrect Tire count");
        }
    }

    public Road_Toll(){
        System.out.println("Default Constructor!");
    }

    public Road_Toll(String type, int tiresCount){
        this.type = type;
        this.tiresCount = tiresCount;
    }


}
