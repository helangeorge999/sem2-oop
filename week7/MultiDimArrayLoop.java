public class MultiDimArrayLoop {
    public static void main(String[] args) {
          /* Create an array with [4][2] */
          int[][] arr = new int[4][2];
          arr[0][0] = 10;
          arr[0][1] = 20;
          arr[1][0] = -10;
          arr[1][1] = -20;
          arr[2][0] = 100;
          arr[2][1] = 200;
          arr[3][0] = -100;
          arr[3][1] = -200;
  
          /*
           * Visual representation
           * [
           * [10,20]
           * [-10,-20]
           * [100,200]
           * [-100,-200]
           * ]
           */
          /* Loop outer array */
          int outerLength = arr.length; // ->4
          for (int outer = 0; outer < outerLength; outer ++) {
              System.out.println("Array in index " + outer);
            //   System.out.println(arr[outer][0]);
            //   System.out.println(arr[outer][1]);
            int innerArrayLength = arr[outer][1];
            for (int inner = 0; inner < innerArrayLength; inner ++ ){
                System.out.println(arr [outer][inner]); // inner loops from 0,1
             }
            }




            /*Make an array of string names 
             * [
             *    ["George", "Niraj", "Subham"], ->0
             *    ["Rijan", "Ram", "Vardaer"], ->1
             * ]
             */
             
             /*Loop each names */
            /*Task 2 on the same loop, the on which array is oscar in */
            /*Answer should be 1 */
            // String[][] names = new String [2][3];

            String[][] name = {{"George", "Niraj", "Subham"}, {"Rijan", "Ram", "Vardaer"}};
            
            name[0][0] = "George";
            name[0][1] = "Niraj";
            name[0][2] = "Subham";
            name[1][0] = "Rijan";
            name[1][1] = "Ram";
            name[1][2] = "Vardae";

            for (int i = 0; i < name.length; i++) {
                System.out.println();
                for (int j = 0; j < name[i].length; j++) {
                    // System.out.print(name[i][j] + "\t\t ");
                    if (name[i][j] == "Ram") {
                        System.out.println(i + " " + j);
                }
    }
}
