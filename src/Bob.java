import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("What would you to say to Bob?");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        while(!question.isBlank()) {
            if (question.endsWith("?") || question.endsWith("?!")) {
                System.out.println("Bob: Sure.");
            } else if (question.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (question.isBlank()) {
                System.out.println("Bob: Fine. Be that way!");
                break;
            } else {
                System.out.println("Bob: Whatever.");
            }
            question = input.nextLine();
        }
    }
}
