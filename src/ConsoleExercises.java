import java.sql.SQLData;
import java.util.Scanner;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//        String userInputInteger = scanner.nextLine(); //returns integers as strings
//        int parsedUserInput = Integer.parseInt(userInputInteger);// integer.parseInt turns the string into a integer
//        System.out.println(parsedUserInput + parsedUserInput);
//        System.out.print("Enter an integer: ");
//        int input = scanner.nextInt();
//        System.out.println("You entered: " + input);
//        String nextLine = scanner.nextLine();
//        System.out.print("Please enter the first word: ");
//        String word1 = scanner.nextLine();
//        System.out.print("Please enter the second word: ");
//        String word2 = scanner.nextLine();
////        scanner.next();
//        System.out.print("Please enter the third word: ");
//        String word3 = scanner.nextLine();
////        scanner.next();
//        System.out.print("your first word was:" + word1);
//        String nextLine1 = scanner.nextLine();
//        System.out.print("Please enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.print("your sentence was:" + sentence);
        System.out.print("Enter the length of your classroom: ");
        String lengthInput = scanner.nextLine();
        int parsedLengthInput = Integer.parseInt(lengthInput);
        System.out.print("What is the Width of your classroom: ");
        int parsedWidthInput = Integer.parseInt(lengthInput);
        String widthInput = scanner.nextLine();
        System.out.print("Your input for Length was :" + parsedLengthInput);
        String nextLine2 = scanner.nextLine();
        System.out.print("Your input for Width was :" + parsedWidthInput);
        int perimeter = (Integer.parseInt(lengthInput) + Integer.parseInt(widthInput)) * 2;
        System.out.println("The perimeter of your room is: %d" + perimeter);

    }
}

