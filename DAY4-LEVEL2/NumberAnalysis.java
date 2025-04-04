import java.util.Scanner;

public class NumberAnalysis {
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        return Integer.compare(number1, number2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print("Number " + number + " is Positive and ");
                if (isEven(number)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("Number " + number + " is Negative.");
            }
        }
        
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult > 0) {
            System.out.println("First number is greater than last number.");
        } else if (comparisonResult < 0) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
        
        scanner.close();
    }
}
