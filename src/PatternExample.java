import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());

        String phoneNumber = "+7 (000) 000-00-00";
        String phonePattern = ("(\\+7 | 8)\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}");
        System.out.println(Pattern.matches(phonePattern, phoneNumber));

        System.out.println(phoneNumber.matches(phonePattern));
    }
}
