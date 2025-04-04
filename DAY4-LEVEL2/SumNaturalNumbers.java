import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbersRecursive(n - 1);
    }
    
    public static int sumOfNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        scanner.close();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }
        
        int sumRecursive = sumOfNaturalNumbersRecursive(n);
        int sumFormula = sumOfNaturalNumbersFormula(n);
        
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match and are correct!");
        } else {
            System.out.println("There is an error in the computation.");
        }
    }
}
