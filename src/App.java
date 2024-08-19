import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\u001B[34m" + "Welcome to password saftey checker!" + "\u001B[0m" + "\n");
        System.out.println("You password should:");
        System.out.println("\u001B[33m" + " * Have one special character character." + "\u001B[0m");
        System.out.println("\u001B[33m" + " * Have lenght of 12 characters or more." + "\u001B[0m");
        System.out.println("\u001B[33m" + " * Have one upper and one lowercase character." + "\u001B[0m");
        System.out.println("\u001B[33m" + " * Have one digit." + "\u001B[0m" + "\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a prompt: ");
        String userInput = scanner.nextLine();
        
        ErrorHandling errorHandler = new ErrorHandling();
        String answer = errorHandler.getAnswer(userInput);
        if (errorHandler.hasError) {
            System.out.println("\n" + answer + "\n");
            System.out.println("\u001B[31m" + "Error: Exiting the program..." + "\u001B[0m");
            System.exit(0);
        }
        
        
        SpacialCharsCheck charsChecker = new SpacialCharsCheck();
        answer = charsChecker.getAnswer(userInput);
        System.out.println("");
        System.out.println(answer);
        
        CharLenght lenghtChecker = new CharLenght();
        answer = lenghtChecker.getAnswer(userInput);
        System.out.println(answer);

        CharCases caseChecker = new CharCases();
        answer = caseChecker.getAnswer(userInput);
        System.out.println(answer);

        DigitCharacters digitChecker = new DigitCharacters();
        answer = digitChecker.getAnswer(userInput);
        System.out.println(answer);
        
        scanner.close();
    }
}
