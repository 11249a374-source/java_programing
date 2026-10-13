
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        
        System.out.println("Length: " + str.length());

       
        System.out.println("Uppercase: " + str.toUpperCase());

       
        System.out.println("Lowercase: " + str.toLowerCase());

     
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

      
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

      
        if (!str.isEmpty()) {
            System.out.println("First character: " + str.charAt(0));
        }

       
        System.out.println("Replace 'a' with '@': "
                + str.replace('a', '@'));

     
        System.out.println("Contains 'Java': "
                + str.contains("Java"));

        
        System.out.println("Trimmed: '" + str.trim() + "'");

        
        String[] words = str.trim().isEmpty()
                ? new String[0]
                : str.trim().split("\\s+");
        System.out.println("Word count: " + words.length);

        sc.close();
    }
}
