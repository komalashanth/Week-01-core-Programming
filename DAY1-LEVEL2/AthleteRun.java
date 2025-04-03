import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        int side3 = sc.nextInt();

        int perimeter = side1 + side2 + side3;
        int totalDistance = 5000;
        int rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
