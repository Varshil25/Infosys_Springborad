package v13_Text_File;
// 13.3
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Sort_Line {
    /*
    Interview Question.
    Alphabetically sort the lines of a text file.
     */
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VARSHIL PATEL\\Documents\\TextFile\\File1.txt");

        List<String> list = FileUtils.readLines(file , "UTF-8");

        Collections.sort(list);

        FileUtils.write(file,"", "UTF-8", false);

        for (String x : list){
            FileUtils.write(file,x+"\n", "UTF-8", true);
            System.out.println(x);
        }



    }
}
