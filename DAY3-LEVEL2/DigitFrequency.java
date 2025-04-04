import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String numStr = scanner.next();
        int length = numStr.length();
        int[] digits = new int[length];
        int[] frequency = new int[10];
        
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
            frequency[digits[i]]++;
        }
        
        System.out.println("Digit Frequency in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
        scanner.close();
    }
}
