import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double tempSalary = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double tempYears = sc.nextDouble();

            if (tempSalary <= 0 || tempYears < 0) {
                System.out.println("Invalid input. Please re-enter details.");
                i--; // Decrement index to re-enter the values
                continue;
            }

            salary[i] = tempSalary;
            yearsOfService[i] = tempYears;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        System.out.println("Total Old Salary of all employees: INR " + totalOldSalary);
        System.out.println("Total Bonus Amount to be paid: INR " + totalBonus);
        System.out.println("Total New Salary of all employees: INR " + totalNewSalary);
    }
}

