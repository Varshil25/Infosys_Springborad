package v13_Text_File;
// 13.2

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Edit_TextFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File1.txt");

        FileUtils.write(file , "Add some new line using this write method." , "UTF-8" , true);
    }
}
