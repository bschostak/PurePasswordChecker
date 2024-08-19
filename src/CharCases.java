public class CharCases {
    public String getAnswer(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        if (hasLowerCase && hasUpperCase) {
            return "\u001B[32m" + "Password have both upper and lower case characters."+ "\u001B[0m";
        } else if (hasLowerCase && !hasUpperCase) {
            return "\u001B[31m" + "Password have lower case characters, but no upper case characters." + "\u001B[0m";
        } else {
            return "\u001B[31m" + "Password have upper case characters but no lower case characters." + "\u001B[0m";
        }
    }
}
