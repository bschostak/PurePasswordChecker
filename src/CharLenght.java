public class CharLenght {
    public String getAnswer(String password) {
        if (password.length() <= 12) {
            return "\u001B[31m" + "Password is shroter than 12 characters." + "\u001B[0m";
        }
        return "\u001B[32m" + "Password have a safe lenght." + "\u001B[0m";
    }
}
