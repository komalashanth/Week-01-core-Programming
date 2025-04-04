import java.util.Scanner;

public class WindChillCalculator {
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();
        
        scanner.close();
        
        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        } else {
            System.out.println("Wind chill calculation is only valid for temperatures <= 50°F and wind speeds >= 3 mph.");
        }
    }
}

