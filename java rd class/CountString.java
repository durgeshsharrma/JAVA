import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create an array to store the count of each character (assuming ASCII characters)
        int[] charCount = new int[256];

        // Count the occurrences of each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            charCount[character]++;
        }

        System.out.println("Character counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                char character = (char) i;
                System.out.println("'" + character + "': " + charCount[i] + " times");
            }
        }

        scanner.close();
    }
}





