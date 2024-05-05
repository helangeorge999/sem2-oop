import java.util.Scanner;

public class Qno8 {
    public static void main(String[] args) {
        /*8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321. */
   
    
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    // Function to reverse the digits of a number
    public static int reverseDigits(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
        
    }
}
