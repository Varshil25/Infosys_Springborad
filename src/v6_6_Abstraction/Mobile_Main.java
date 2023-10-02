package v6_6_Abstraction;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Mobile_Main {
    public static void main(String[] args) {

        Mobile m ;

        m = new ios();
        m.doubletap();

        m = new Android();
        m.doubletap();
    }
}
