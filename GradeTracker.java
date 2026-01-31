import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            sum += arr[i];

            if (arr[i] > highest) {
                highest = arr[i];
            }

            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        double average = (double) sum / n;
        System.out.println("\n----- Student Grade Summary -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Marks: " + arr[i]);
        }

        System.out.println("--------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}
