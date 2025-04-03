import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();


        double heightM = heightCm / 100;

        
        double bmi = weight / (heightM * heightM);

        
        String category;
        if (bmi <= 18.4) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display the results
        System.out.println("\n BMI Result");
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        System.out.println("Weight Status: " + category);

        sc.close();
    }
}
