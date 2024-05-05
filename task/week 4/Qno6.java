import java.util.Scanner;

public class Qno6 {
    public static void main(String[] args) {
        /*6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

*

**

***

****

*****

Use a nested for loop to generate the above pattern.

 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the triangle: ");
        int width = scanner.nextInt();
        scanner.close();

        // Generate the triangle of asterisks
        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }

    }
}
