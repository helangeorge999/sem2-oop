import java.util.Scanner;

public class Qno4 {
    public static void main(String[] args) {
        

        /*4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

*****

*****

*****

*****

***** */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the square: ");
        int width = scanner.nextInt();
        scanner.close();

        // Generate the square of asterisks
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
