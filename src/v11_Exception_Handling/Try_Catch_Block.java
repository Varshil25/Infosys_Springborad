package v11_Exception_Handling;
//11.5
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 11.5
public class Try_Catch_Block {
    public static void main(String[] args) {
        abc();

        System.out.println("Hello World.");
    }

    public static  void abc(){
            try {
                FileInputStream x = new FileInputStream("abc.text");
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }catch (IOException e1){
                System.out.println(e1.getMessage());
            }catch (java.lang.Exception e2){
                System.out.println(e2.getMessage());
            }catch (Throwable e3){
                System.out.println(e3.getMessage());
            }

    }
}
