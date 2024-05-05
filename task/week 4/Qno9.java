import java.util.Scanner;

public class Qno9 {
    public static void main(String[] args) {
        /*9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50,
         *  less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.
         */
   
        Scanner scanner = new Scanner(System.in);

        int countGreaterThan50 = 0;
        int countLessThan50 = 0;
        int countEqualTo50 = 0;
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();

            if (num > 50) {
                countGreaterThan50++;
                sumGreaterThan50 += num;
            } else if (num < 50) {
                countLessThan50++;
                sumLessThan50 += num;
            } else {
                countEqualTo50++;
            }
        }

        scanner.close();

        System.out.println("Numbers greater than 50: " + countGreaterThan50);
        System.out.println("Numbers less than 50: " + countLessThan50);
        System.out.println("Numbers equal to 50: " + countEqualTo50);

        if (countGreaterThan50 > 0) {
            double avgGreaterThan50 = (double) sumGreaterThan50 / countGreaterThan50;
            System.out.println("Average of numbers greater than 50: " + avgGreaterThan50);
        }

        if (countLessThan50 > 0) {
            double avgLessThan50 = (double) sumLessThan50 / countLessThan50;
            System.out.println("Average of numbers less than 50: " + avgLessThan50);
        }
    }
}
