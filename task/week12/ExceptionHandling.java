public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program start");

        // Example 1: ArithmeticException
        int num1 = 100;
        try {
            int num2 = num1 / 0; // exception - program ends here
        } catch (ArithmeticException ex) {
            System.out.println("Number error");
        } finally {
            System.out.println("I run with or without exception");
        }

        // Example 2: ArrayIndexOutOfBoundsException
        int[] numArr = new int[5];
        numArr[0] = 10;
        try {
            numArr[100] = 20;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array not long enough");
        }

        // Example 3: NullPointerException
        String data = null;
        try {
            System.out.println(data.length()); // data.length() - number of characters
        } catch (NullPointerException ex) {
            System.out.println("Null data");
        }

        // Multi-level try-catch
        try {
            int inD1 = 10;
            int inD2 = inD1 / 0;
            String data2 = null;
            System.out.println(data2.length());
            System.out.println("Try exit");
        } catch (ArithmeticException ex) {
            System.out.println("Number exception");
        } catch (NullPointerException ex) {
            System.out.println("Null ayo");
        } finally {
            System.out.println("Exiting try");
        }

        // Catch any exception
        try {
            int number1 = 10;
            int number2 = number1 / 0;
            String data3 = null;
            System.out.println(data3.length());
            int[] intArr10 = new int[10];
            intArr10[20] = 10000;
        } catch (Exception ex) {
            System.out.println("I catch any exception");
        }

        // Ensure exception example
        try {
            ensureException(); // to run this function, must be inside try-catch
        } catch (Exception ex) {
            System.out.println("Exception");
        }

        // Task: Handle multiple exceptions
        handleMultipleExceptions();

        System.out.println("Program stop");
    }

    static void throwExample(int num) {
        if (num < 18) {
            // manually throw an exception
            throw new ArithmeticException("Not eligible");
        }
    }

    static void ensureException() throws Exception {
        System.out.println("To run this must wrap in try-catch");
    }

    static void handleMultipleExceptions() {
        try {
            int number1 = 10;
            int number2 = number1 - 10;
            int number3 = number1 / number2;
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception: Division by zero");
        } finally {
            System.out.println("Handled division by zero");

            try {
                String name = null;
                System.out.println(name.length());
            } catch (NullPointerException ex) {
                System.out.println("NullPointerException: Name is null");
            } finally {
                System.out.println("Handled null name");

                try {
                    String[] names = new String[100];
                    names[0] = "Ram";
                    names[110] = "Oskar";
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("ArrayIndexOutOfBoundsException: Invalid index");
                } finally {
                    System.out.println("Handled array index out of bounds");
                }
            }
        }
    }
}
