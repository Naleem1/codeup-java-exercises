package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public static String getString() {
        System.out.print("Give me some input:");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Do you want to continue?[Y,N]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");

    }

//    public boolean yesNo(String input){
//
//    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
    }
}