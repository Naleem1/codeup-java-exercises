import java.util.Scanner;

public class ControlStatementAndLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this loop runs as long as I is less that 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        //this loop counts by 2 up to 100
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);
        //this loop counts backwards by 5 from 100 to -10
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);
        //this loop starts at 2 and displays number squared while less than 1,000,000
//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);
        // fizzbuzz
//          for (int i = 1; i <= 100; i++) {
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        System.out.println("FizzBuzz");
//                    } else if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else {
//                        System.out.println(i);
//                    }
//                }
        System.out.println("enter an integer:");
        String userInput = scanner.nextLine();
        System.out.println(Integer.parseInt(userInput));
        System.out.println("Here is your Table!");
        System.out.println("number|squared|cubed");
        System.out.println("-----|-----|-----");
        for(int i = 0; i < Integer.parseInt(userInput); i++){
            System.out.printf("%d      | %d       | %d%n", i, i*i, i*i*i);
        }




    }
}
