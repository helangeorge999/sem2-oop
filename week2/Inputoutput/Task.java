import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

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

         Scanner scan1 = new Scanner (System.in);
         System.out.println("What is your name? :");
         String name = scan1.nextLine();
         System.out.println("Over 18? :");
         boolean status = scan1.nextBoolean();
         System.out.println("How many siblings? :");
         int sibling = scan1.nextInt();
         System.out.println("Hello " + name);
         System.out.println("Over 18?" + status);
         System.out.println("You have " + sibling + " siblings");
         scan1.close();


        
        // Scanner scan1 = new Scanner(System.in);

        // System.out.print("What is your name? ");
        // String name = scan1.nextLine();

        // System.out.print("Are you over 18? (true/false) ");
        // boolean status = scan1.nextBoolean();

        // System.out.print("How many siblings do you have? ");
        // int siblings = scan1.nextInt();

        // System.out.println("Hello " + name + ",");
        // System.out.println("Over 18? " + status);
        // System.out.println("You have " + siblings + " sibling(s).");

        // scan1.close();

    }
}
