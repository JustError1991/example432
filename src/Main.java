import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("a..a");
        Matcher matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll(""));

        text = "aba aba a!a abba adca abea";
        pattern = Pattern.compile("ab+");
        matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll(""));

        text = "47238957285 2000 2011 348920 230 423 420025";
//        pattern = Pattern.compile("2[01][0-9][0-9]");
        pattern = Pattern.compile("20\\d{2}");
        matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll(""));

        text = "*-ки *должны* примыкать к *СЛОВУ*)";
        pattern = Pattern.compile("\\*[А-Яа-я]+\\*");
        matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll(""));

        text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        pattern = Pattern.compile("\\ss[A-Za-z]+s\\s");
        matcher = pattern.matcher(text);
        System.out.println(text);
        System.out.println(matcher.replaceAll(""));

    }
}
