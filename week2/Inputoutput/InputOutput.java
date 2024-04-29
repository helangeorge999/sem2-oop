import java.util.Scanner;
/*Or
 *import jaba.util.*;
 */
public class InputOutput{

    public static void main(String[] args) {
        
        /* User Output */
        System.out.println("This sentence will have line break ");
        /* System.out.print */
        System.out.print("This will not have break");
        System.out.print("This line will continue. \n");
        /*String formatting using System.out.Printf
         * %s string, %d Integral, %f floating point, %b boolean
         * This will also not break line
         */
        System.out.printf("Hello %s. Good Morning ", "world");
        System.out.printf("The number is %d ", 10);
        /* can use multiple formatter */
        System.out.printf("\nThe floating %f and boolean %b", 10.3f, false);

        /* User input
         * import java.util.Scanner; // copy this line at the top of the code 
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("The following take whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);
        System.out.println("The following takes integer");
        int intInput = scan.nextInt();
        System.out.println("The input taken is " + intInput);
        System.out.println("The following output take double");
        double doubleInput = scan.nextDouble();
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("THe input taken is " + booleanInput);
        scan.close(); //you must close the sccanner once all input is taken


        /*Task
         * Make a new scanner object scan1
         * Prompt the following and take input
         * What is your name? save the value to string -> name
         * are you over 18? save the input to boolean -> status
         * How many sibling? save the input to integer -> sibling
         * Print the following
         * Hello name,
         * Over 18?, status
         * You have sibling number of sibling
         */




    }
}