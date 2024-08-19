import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitCharacters {
    public String getAnswer(String password) {
        String regex = "[0-9]";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(password);

        if (!matcher.find()) {
            return "\u001B[31m" + "Password doesn't have digits." + "\u001B[0m";
        }
        return "\u001B[32m" + "Password have digits." + "\u001B[0m";
    }
}
