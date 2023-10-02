package v13_Text_File;
// 13.5

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Removing_Duplicate_Words {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File1.txt");

        String str1 = FileUtils.readFileToString(file, "UTF-8");

        str1 = str1.replaceAll("\n", " ");
        String [] arr = str1.split(" ");
        String str2 = " ";

        for (String x : arr){
            if (!str2.contains(x) && x.trim()!=""){
                str2 = str2 + " " + x;
            }
        }
        FileUtils.write(file, str2 ,"UTF-8", false);
    }
}
