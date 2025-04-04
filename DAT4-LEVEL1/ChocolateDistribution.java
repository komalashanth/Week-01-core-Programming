import java.util.Scanner;

public class ChocolateDistribution {
    
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();
        
        scanner.close();
        
        if (numberOfChildren > 0) {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            System.out.println("Error: Number of children must be greater than zero.");
        }
    }
}

