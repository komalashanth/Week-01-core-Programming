import java.util.*;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextInt();

        double miles = km / 1.6;

        System.out.printf("The total miles is %.2f mile for the given %.2f km", miles, km);
    }
}
