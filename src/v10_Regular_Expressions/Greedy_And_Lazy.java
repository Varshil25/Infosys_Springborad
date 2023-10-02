package v10_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 10.7
public class Greedy_And_Lazy {
    public static void main(String[] args) {

        String str1 = "XXvarshilYYpatelXXSaffronyYYInstituteXX200390116025YYVpatel@25";

        String patt = "XX.*?YY";

        Pattern p = Pattern.compile(patt);
        Matcher m = p.matcher(str1);

        System.out.println(m.results().count());
        m.reset();

        while (m.find()){
            System.out.println("Start at :" + m.start() );
            System.out.println(m.group());
        }
    }
}
