package v11_Exception_Handling;
// 11.4
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// 11.4
public class Throws_Declarations {
    public static void main(String[] args) throws IOException {
        abc();
    }

    public static void abc() throws FileNotFoundException {
        FileInputStream x = new FileInputStream("D:\\Internship letter");

    }
}
