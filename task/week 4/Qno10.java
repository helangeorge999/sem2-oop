import java.util.Scanner;

public class Qno10 {
    public static void main(String[] args) {
        
        /*10. Write a program that asks the user for a positive nonzero integer value. The program should use
         a loop to get the sum of all the integers from 1 up to the number entered.
         For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive nonzero integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive nonzero integer.");
        } else {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("The sum of integers from 1 to " + number + " is: " + sum);
        }

        scanner.close();
    }
}
