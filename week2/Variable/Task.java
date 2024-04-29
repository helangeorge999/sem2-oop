public class Task {

    public static void main (String []args){
         /* Note this type cast can only be done in primitive data type */
        /* Task 
         * Make one double variable called doubleVar1 = 1000.12
         * Explicity cast the variable into float, floarVar1
         * Explicity cast the floatVar1 into int, IntVar1
         * Make a String variable with "The integer is"
         * Print the String variable and print the int variable in another
         */

        double doubleVar1 = 1000.12;
        float floatVar1 = (float) doubleVar1;
        int intVar1 = (int) floatVar1;
        String info = "The interger is";
        System.out.println(info);
        System.out.println(intVar1);
    
    
    }

}
