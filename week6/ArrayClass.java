public class ArrayClass{
    public static void main(String[] args) {
        /*To create an aarray datatype followed by []*/
        int[] myFirstArray;
        /*Initializing the array we need new reference */
        myFirstArray = new int[6]; //Here the new int[6] -> refers to the size of array
        /*The size of an array can be further access by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My First array size is " + myFirstArrayLength);


        /*Using index for array operation */
        myFirstArray[0]=10;
        myFirstArray[1]=30;
        myFirstArray[2]=100;

        /* To print the array use the same index */
        System.out.println("The First element is in 0 index " + myFirstArray[0]);
        /*can also create a new int value  */
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The second element stored " + secondArrayIndex);

        /*Declaration and Initialization */
        int[] mySecondArray = new int [6];

        /*Declaration, Initialization and value assign */
        int[] myThirdArray = {10, 20, 30, 0, 100};
        /*Or using constructor */
        int[] myFourthArray = new int []{1,2,3,4};



        
       
    }
}
