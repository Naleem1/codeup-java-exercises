import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1_000_000);
//        for (long i = 2; i < 1_000_000; i*=i){
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        String choice = "y";
//        while(choice.equalsIgnoreCase("y")) {
//            System.out.println("What number would you like to go up to?");
//            Scanner input = new Scanner(System.in);
//            int number = input.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= number; i++) {
//                int squared = i * i;
//                int cubed = squared * i;
//                System.out.println(i + "      | " + squared + "       | " + cubed);
//            }
//            System.out.println("Do you want to continue? [y/N]");
//            input.nextLine();
//            choice = input.nextLine();
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number grade?");
        int numberGrade = input.nextInt();
        input.nextLine();
        if (numberGrade >= 99) {
            System.out.println("The letter grade is: A+");
        } else if (numberGrade <= 98 && numberGrade >= 88) {
            System.out.println("The letter grade is: A");
        } else if (numberGrade <= 87 && numberGrade >= 80) {
            System.out.println("The letter grade is: B");
        } else if (numberGrade <= 79 && numberGrade >= 67) {
            System.out.println("The letter grade is: C");
        } else if (numberGrade <= 66 && numberGrade >= 60) {
            System.out.println("The letter grade is: D");
        } else if (numberGrade <= 59 && numberGrade >= 0) {
            System.out.println("The letter grade is: F");
        }

    }
}
