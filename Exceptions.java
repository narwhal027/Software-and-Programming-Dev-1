// This program was made for a Programmin and Software Dev 1 class run by Kim Gross.
// This program was made by Logan Hansen.
public class Exceptions {
    public static void main(String[] args) {
        try {
            // Array with an error causing an ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access element at index 3: " + numbers[3]); // Trying to access an element at index 3
        } catch (ArrayIndexOutOfBoundsException e) { // Catching ArrayIndexOutOfBoundsException
            System.out.println("An error occurred: " + e.getMessage()); // Printing error message
        }

        try {
            // Division by zero causing ArithmeticException
            int result = 10 / 0; // Division by zero
            System.out.println("Result of division by zero: " + result); // Printing result of division
        } catch (ArithmeticException e) { // Catching ArithmeticException
            System.out.println("An error occurred: " + e.getMessage()); // Printing error message
        }

        System.out.println("The program caught the errors and closed without crashing."); // Printing final message
    }
}
