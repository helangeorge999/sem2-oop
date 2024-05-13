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
          for (int j = 0; j < outerLength; j++) {
              System.out.println("Array in index " + j);
              System.out.println(arr[j][0]);
              System.out.println(arr[j][1]);
            }
  
    }
}
