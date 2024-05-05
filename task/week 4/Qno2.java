public class Qno2{
    public static void main(String[] args) {
        /*2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

Miles    Kilometers

1    1.609

2    3.218

…    ….

9    14.481

10    16.090 */


       System.out.println("Miles    Kilometers");
       System.out.println("-------------------");

       for (int mile = 1; mile <= 10; mile++) {
           double kilometers = mile * 1.609;  // Convert miles to kilometers
           System.out.printf("%-5d   %.3f\n", mile, kilometers);
       }
    }
}