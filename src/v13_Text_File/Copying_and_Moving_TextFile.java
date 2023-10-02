package v13_Text_File;
// 13.4

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Copying_and_Moving_TextFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File1.txt");
        File file2 = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File2.txt");
        File dir = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\Dir1");
        File file3 = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File3.txt");

        // Copying contents one file to another.
        FileUtils.copyFile(file1 , file2);

        // Copying contents one file to Directory.
        FileUtils.copyFileToDirectory(file1 , dir);

        // Rename / Move a file.
        FileUtils.moveFile(file1, file3);


    }
}
