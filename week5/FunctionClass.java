public class FunctionClass {
    /*write a fucntion inside a class */
    void printSomthing(){
       System.out.println("This is funciton parts");
    
   }
       public static void main(String[] args) {
           /*To se a fucntion you need to mae object
            * note: just rememeber the syntax for now
            */
           FunctionClass fc= new FunctionClass();
           fc.printSomthing();;
           /*You can call this function in need */
           fc.printSomthing();
          
       }
    }