import java.util.*;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + friends[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + height[tallestIndex] + " cm");
    }
}
