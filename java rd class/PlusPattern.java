import java.util.Scanner;

public class PlusPattern {
    public static void main(String[] args) {
        
        

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 10 / 2 || j == 11 / 2) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

