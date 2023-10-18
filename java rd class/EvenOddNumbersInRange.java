import java.util.Scanner;

public class EvenOddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Even numbers in the range:");
        for (int number = lowerBound; number <= upperBound; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Odd numbers in the range:");
        for (int number = lowerBound; number <= upperBound; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
