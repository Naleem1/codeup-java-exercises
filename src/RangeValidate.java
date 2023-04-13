import java.util.Scanner;

public class RangeValidate {

    public static int InputRange(int minValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.printf("Enter a number between " + minValue + " and " + maxValue + "\n");
        userInput = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();

        if (userInput < minValue || userInput > maxValue) {
            System.out.println("Invalid input. Please try again.");
            userInput = InputRange(minValue, maxValue);
        }

        return userInput;
    }
    public static void main(String[] args) {
        int userInput = InputRange(1, 100);
        System.out.println("User input within range: " + userInput);
    }

}
