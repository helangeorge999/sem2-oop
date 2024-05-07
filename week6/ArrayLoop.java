public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int arrayLength = data.length;
        /* First approach */
        for (int index = 0; index < arrayLength; index ++){
            System.out.println("Index " + index + " Value" + data[index]);
        }
        System.out.println("Using length - 1");
        /*Second approach  */
        for (int index = 0; index <= arrayLength - 1; index ++){
            System.out.println("Index " + index + " Value" + data[index]);
        } 
          
         
    }
   
}
