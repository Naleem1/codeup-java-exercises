public class ExceptionsHandlingLecture {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[99]);
            throw new Exception("Something bad happened");
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println(e);
            System.out.println("After the error happens...");
        } finally {
            System.out.println("This is my finally block");
        }
        System.out.println("This is after the try/catch/finally");

    }
}
