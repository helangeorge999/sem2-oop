public class MultiDimArray{

    public static void main (String[] args){
        // create N-dimensional array
        // 1D array
        int[] [] oneDArray;
        // 2D Array
        int[] [] twoDarray;
        // 3D array
        int[] [] [] threeDArray;
       
        // Allocating memory/size
        twoDarray = new int[3][5];
        // First size three represent how many inner arrray
        // second size 5 represent how many value in inner array
        /*[
            [10,20,0,0,0]
            [0,0,100,0,0]
            [0,0,0,0,0]
        ]*/
        // To take the first inner array use index
        // twoDarray[0]
        // To take the value in inner arrayb use internal index
        twoDarray[0][0] = 10;
        twoDarray[0][1] = 20;
        twoDarray[1][2] = 100;
    }
}