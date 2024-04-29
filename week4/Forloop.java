public class Forloop {}
    
    public static void main(String[] args) {
             /*Use for loop when condition is fixed */
            for (int index = 0; index < 5; index ++){
                System.out.println("Loop running"+index);
                }
    
            /*Decrement loop*/
            for(int index=10; index>=0; index--){
                System.out.println("Loop reunning" +index);
            }
            /* make the loop table for this */
    
    
    
             /* make the loop table for this */
            /*task
             * make a multiplication table of 2
             * print like the following
             * 2*1=2
             * 2*2=4
             * '
             *
             * ''
             *
             * note:initialize 1
             * condition <=10 or 11
             * increment ++
             */
     
             for(int i=1; i<=10;i++){
                System.out.println("2*" + i+ "=" +2 *i);
            


                
            /*nested loop */
             for(int outer=0; outer<3; outer++){
               for(int inner=2; inner>=0; inner--){
                  System.out.println("Inner" +inner);
            }
                System.out.println("Outer"+outer);

                
             }
    }
    
}
    
    
    
