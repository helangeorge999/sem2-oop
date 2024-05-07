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

         

    }
    
}
