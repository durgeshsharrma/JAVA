public class pyramid {
    public static void main(String[] args) {
        int rows = 5; // Change this to adjust the height of the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print asterisks for the pyramid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
    }
}

