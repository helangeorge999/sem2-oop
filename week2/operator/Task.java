package operator;

public class Task {

    public static void main(String[] args) {

    
        /* Task 1 
         * Write a program to print weather a variable is greater or equal to 18
        */
         int Number1 = 28, Number2 = 18;
         System.out.println("Number1 is greater than or equal to Number2? " + (Number1 >= Number2 ));


        /*Task 2
         * Write a program to print simple interest from variables
         * Make 3 variable for amount, time and rate and save the calculation into a variable
         * Formula
         * si = amount * time * rate/100
         */
        int p = 1000;
        float r = 0.1f;
        int t = 3;
        float i = p*t*r /100;
        System.out.println("The interest is " + i);


         /* Task 3
          * Write a program to print the area and perimeter of rectangle
          * a = l*b
          * p = 2(l+b)
          */
          int l = 9, b = 6;
          System.out.println("An area of a rectangle is " + (l*b));
          System.out.println("The perimeter of a rectangle is " + (2*(l+b)));

         
          /* Task 4
           * complete the task 1 using ternary operators
           */
          String output = Number1>=Number2? "True": "False";
          System.out.print(output);
    }
    
}
