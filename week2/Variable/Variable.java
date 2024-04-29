public class Variable{
     
    /* Instance variable
     * will need object to access this variable
     * Not  shared between the object 
     */
    int instanceVariable = 100;
    /* Static/Class variable 
     * no need of object, can be called from class
     * Shared betweeen the objects
     */
    static int staticVariable = 20;



    public static void main(String[]args){
        /*Non primitive data type */
        /*Declaraton */
        byte byteValue;
        /*Initialization*/
        byteValue =100;
        /*declaration and initialization*/
        short shortvalue =200;
        /*multiple declaration*/
        int intvalue1, intvalue2;
        intvalue1=10000;
        intvalue2=2000;
        /*multiple declation and intialization */
        long longval1 = -9000, longval2 =9000;
        float floatvalue =90.90f; // the letter 'f' is needed
        double doublevalue =100.897d; //the letter 'd' is optional
        char charvalue = 'c'; //must use single quote '
        boolean booleanvalue= false;
        /*illegal action below */
        //byte bytevalue =100; //we cannot redeclare the variable
        //bytevalue =200; //instead use ressigment
        //boolean bolval2 ='false'; //cannot use different type
        //byte bytevalue2 =1000000; // cannot exceed min and max

        /*non primitive data type */
        String stringvalue ="this is a string value";
        /*using class */
        String stringValue2 = new String("This string uses class");
        System.out.println(stringValue2);
        /* Object, for this we can use the same public class made */
        Variable variableObject = new Variable();
        /* Use object from above to access instance variable */
        System.out.println(Variable.staticVariable);
        /* Explicit Casting */
        double doubleValueType = 190.8109;
        int doubleValueConvertedToInt = (int) doubleValueType;


        /* Manually specially data type for eg. (int) */

        /* Note this type cast can only be done in primitive data type */
        /* Task 
         * Make one double variable called doubleVar1 = 1000.12
         * Explicity cast the variable into float, floarVar1
         * Explicity cast the floatVar1 into int, IntVar1
         * Make a String variable with "The integer is"
         * Print the String variable and print the int variable in another
         */
    }
}