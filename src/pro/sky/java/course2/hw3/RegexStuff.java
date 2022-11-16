package pro.sky.java.course2.hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStuff {
    public static void main(String[] args) {
        // special characters - metacharacters
        // [] \ ^ $ . | ? * + ()

        String s = "dfg d 2008 dfddfdf 1890 drg ghjjk 2021.";
        Pattern p = Pattern.compile("\\d{4}");
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}
