package ge.tbc.testautomation.exceptionsStringOpsAndRegex_L7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "555256060";
        String regexExpression = "(5(55)(\\d{6}))";
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()){
            System.out.println("NUMBER IS GEORGIAN GEOCELL");
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
        else {
            System.out.println("ITS SOMETHING ELSE");
        }
    }
}
