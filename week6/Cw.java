public class Cw {
    public static void main(String[] args) {
        
        /* Task
         * create a array of int called myFifthArray
         * with size of 5
         * insert the value of 10, 20, 30, 40 50
         * print the value of an array as well as the multiplied by 2
         * eg;
         * 10 20
         * 20 40
         * 30 60 
         * 40 60 
         * 50 100
         */

         // create a array of int called myFifthArray
         int[] myFifthArray;

         //with size of 5
         myFifthArray = new int [5];
         int myFifthArrayLenght = myFifthArray.length;
         System.out.println("The size of my array is " + myFifthArrayLenght);


         //insert the value of 10, 20, 30, 40 50
         myFifthArray[0]=10;
         myFifthArray[1]=20;
         myFifthArray[2]=30;
         myFifthArray[3]=40;
         myFifthArray[4]=50;

         System.out.println ( myFifthArray[0] + "  " + myFifthArray[0] * 2);
         System.out.println ( myFifthArray[1] + "  " + myFifthArray[1] * 2);
         System.out.println ( myFifthArray[2] + "  " + myFifthArray[2] * 2);
         System.out.println ( myFifthArray[3] + "  " + myFifthArray[3] * 2);
         System.out.println ( myFifthArray[4] + "  " + myFifthArray[4] * 2);

         
           //Array Loop
          // data[100]; this will crash, no index accessible
        /* Task Make an array of length  10
         * Add the value as 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
         * Make another array with the same legth 10
         * Add the valueof first array in negative
         * Use loop on first array to complete this
         * second array should be -10, -20, -30, -40, -50, -60, -70, -80, -90, -100
         * Print the second array
         */
        
         int[] firstArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
         int firstArrayLength = firstArray.length;
         int [] secondArray = new int [10];
         for (int index = 0; index < firstArrayLength; index ++){
            secondArray[index] = -firstArray[index];
            System.out.println("secondArray[index]");
        }
    

        /*Task 3 
         * print the third array in descending
         * should be : -100, -90, -80, -70, ..., -10
         * Note: start loop from (length -1) to 0
        */
        int secondArrayLength = secondArray.length;
        for (int index = firstArrayLength -1; index >= 0; index --){
            System.out.println("Descending " + secondArray[index]);
        }
        
    }

}
    

