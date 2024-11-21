
import java.util.Scanner;

class Solution {
    public static long seriesSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To take user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read input

        // Calculate and display the sum of the series
        System.out.println("Sum of the series 1 + 2 + ... + " + n + " = " + seriesSum(n));

        scanner.close();
    }
}
