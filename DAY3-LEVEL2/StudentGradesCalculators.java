import java.util.Scanner;

public class StudentGradesCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        int[][] marks = new int[n][3];
        double[][] results = new double[n][2];
        String[] grade = new String[n];
        String[] remarks = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextInt();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
            
            results[i][0] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (results[i][0] >= 80) {
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (results[i][0] >= 70) {
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (results[i][0] >= 60) {
                grade[i] = "C";
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            } else if (results[i][0] >= 50) {
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (results[i][0] >= 40) {
                grade[i] = "E";
                remarks[i] = "Level 1, too below agency-normalized standards";
            } else {
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }
        
        System.out.println("\nStudent Grades Report:");
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade\tRemarks");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f%%\t%s\t%s\n",
                marks[i][0], marks[i][1], marks[i][2], results[i][0], grade[i], remarks[i]);
        }
        
        scanner.close();
    }
}
