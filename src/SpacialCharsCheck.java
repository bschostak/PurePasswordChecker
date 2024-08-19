import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpacialCharsCheck {
    public String getAnswer(String password) {

        String regex = "[^a-zA-Z0-9]"; //This regex matches any character that is not a letter (a-z, A-Z) or digit (0-9). The caret (^) at the beginning of the square brackets negates the character class, meaning it matches anything that is not included in the brackets.
        Pattern pattern = Pattern.compile(regex); // This compiles the given regex into a pattern that can be used by a matcher.
        Matcher matcher = pattern.matcher(password); // This creates a matcher that will match the given input against the pattern.

        if (!matcher.find()) { //This method attempts to find the next subsequence of the input sequence that matches the pattern. It returns true if a subsequence of the input sequence matches the pattern.
            return "\u001B[31m" + "Password doesn't have special characters." + "\u001B[0m";
        }
        return "\u001B[32m" + "Password have special characters."+ "\u001B[0m";
    }
}
