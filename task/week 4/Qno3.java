public class Qno3 {
    public static void main(String[] args) {
        
        /*3. Write a program that generates the following table: 

Number    Square

10    100

9    81

..    ….2    4

1    1 */


System.out.println("Number    Square");
System.out.println("----------------");

for (int num = 10; num >= 1; num--) {
    int square = num * num;  // Calculate the square of the number
    System.out.printf("%-8d  %d\n", num, square);
}

    }
}
