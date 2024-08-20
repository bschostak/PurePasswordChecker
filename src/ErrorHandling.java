import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class ErrorHandling {

    boolean hasError = false;

    public String getAnswer(String password) {
        String regex = "[ \\t]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        if (matcher.find()) {
            hasError = true;
            return "Your password contains not allowed characters!";
        }

        String[] easiestPasswords = {
        "123456",
        "123",
        "password",
        "12345678",
        "qwerty",
        "123456789",
        "12345",
        "iloveyou",
        "111111",
        "123123",
        "abc123",
        "qwerty123",
        "1q2w3e4r",
        "letmein",
        "dragonball",
        "baseball",
        "superman",
        "iloveyou1",
        "internet",
        "monkey",
        "sunshine"
        };

        boolean hasEasyPassowrd = Arrays.stream(easiestPasswords).anyMatch(string -> string.equalsIgnoreCase(password));
        /*
        - Arrays.stream(easiestPasswords) creates a stream of elements from the array.
        - .anyMatch(string -> string.equalsIgnoreCase(password)) checks if any element in the stream matches the searchString using equalsIgnoreCase (case-insensitive comparison).
        - The anyMatch method returns true if at least one element matches, otherwise false
        */

        if (hasEasyPassowrd) {
            hasError = true;
            return "'" + password + "'" + " is to easy for a passowrd.";
        }

        return null;
    }
}
