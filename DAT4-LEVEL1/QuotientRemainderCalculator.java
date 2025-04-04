import java.util.Scanner;

public class QuotientRemainderCalculator {
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisor = scanner.nextInt();
        if (divisor != 0) {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient is: " + result[0]);
            System.out.println("Remainder is: " + result[1]);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
