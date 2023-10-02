package v6_1_Inheritance;

public class polymain {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setHeightAndBase(10.6,12.8);
        t1.calArea();

        rectangle r1 = new rectangle();
        r1.setHeightAndBase(15.3,18.6);
        r1.calArea();
    }
}
