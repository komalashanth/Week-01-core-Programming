import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}

