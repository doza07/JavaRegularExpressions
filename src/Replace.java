import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {
    public static void main(String[] args) {
        String regex = ("(\\+7|8)\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}");
        String phoneNumber = "fwefweewf +7(000) 000-00-00 wfsdfsdg +7 (111)111-11-11 efr 8(222) 222-22-22 gerg ";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, "XXX");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder.toString());
    }
}
