import java.util.Scanner;

public class StringOperation{
    
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // This will throw NullPointerException
    }
    
    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Generating NullPointerException
        // generateNullPointerException(); // Uncomment to see the exception
        
        // Handling NullPointerException
        handleNullPointerException();
    }
}
