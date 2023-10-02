package v4_Special_classes;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random r1 = new Random();

        for (int i=0;i<=10;i++) {
            System.out.println(r1.nextInt(10));
            //System.out.println((int) (Math.random() * 1000));
        }
    }
}
