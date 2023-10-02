package v13_Text_File;
// 13.1

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Reading_a_TextFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File1.txt");

        String x = FileUtils.readFileToString(file,"UTF-8");
        System.out.println(x);

    }
}
