// Experiment 6(a): Handling predefined exceptions
public class PredefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: cannot divide by zero.");
        }

        System.out.println("Program continues normally.");
    }
}
