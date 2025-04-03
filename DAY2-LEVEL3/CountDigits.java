import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        do {
            count++;
            temp /= 10; // Remove last digit
        } while (temp > 0);

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
