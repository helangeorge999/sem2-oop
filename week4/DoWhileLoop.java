public class DoWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while (num1 < 0) {
            System.out.println("while checks condition first");
        }
 
        /* Do while checks condition after first interation */
        do {
            System.out.println("Do while checks condition after");
        } while (num1 < 0);
        /* This means do while loop runs at least once */
    }
 
}