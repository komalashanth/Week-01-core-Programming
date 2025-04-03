import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;

        System.out.printf("The area of the triangle is %.2f square inches.\n", areaInInches);
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", 
                          heightInCm, heightInFeet, height);
    }
}
