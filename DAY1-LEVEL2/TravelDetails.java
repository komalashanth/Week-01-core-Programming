import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter your final destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from starting city to via city (in miles): ");
        int fromToVia = sc.nextInt();

        System.out.print("Enter the distance from via city to final city (in miles): ");
        int viaToFinalCity = sc.nextInt();

        System.out.print("Enter the total time taken (in hours): ");
        int timeTaken = sc.nextInt();

        int totalDistance = fromToVia + viaToFinalCity;
        int avgSpeed = totalDistance / timeTaken;

        System.out.println("Hello " + name + ", your journey details are as follows:");
        System.out.println("From: " + fromCity + " -> Via: " + viaCity + " -> To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + avgSpeed + " mph");

        int result1 = totalDistance + timeTaken * 2;
        int result2 = (totalDistance + timeTaken) * 2;
        int result3 = totalDistance * 2 / timeTaken;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}
