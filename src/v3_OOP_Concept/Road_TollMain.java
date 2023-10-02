package v3_OOP_Concept;

public class Road_TollMain {
    public static void main(String[] args) {
        Road_Toll rl = new Road_Toll();

        rl.type = "sadan";
        rl.tiresCount = 4;
        rl.calculateToll();

        Road_Toll rl1 = new Road_Toll("Truck" , 6);
        rl1.calculateToll();
    }
}
