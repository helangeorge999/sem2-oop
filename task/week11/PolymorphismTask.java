public class PolymorphismTask{
    public static void main(String[] args){
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(1, 2, 3));
        mo.add();
        System.out.println(mo.substraction(20, 10));
        System.out.println(mo.substraction(2.5, 1.5, 0.5));
        mo.substraction(5.5);
        mo.substraction(10);
        System.out.println(mo.substraction(10, 20, 5.5));
        // Method overriding
        // Polymorphism allow Parent Class to
        // hold child class Object
        Document d1 = new Document();
        d1.print("Dell XPS");
        Document d2 = new MsWord();
        d2.print("Xeroz");
        // When doing so, though we are creating
        // from ChildClass MsWord() we can
        // only function/attribute from Document
        Document d3 = new Office365();
        d3.print("Xeroz");
        // cannot access d3.internet

        Spreadsheet s1 = new Spreadsheet();
        s1.addRow(5);
        s1.addColumn(3);

        Spreadsheet s2 = new MsExcel();
        s2.addRow(10);
        s2.addColumn(7);
    }
}
// Method Overloading
// Same function with difference in parameter
class MathOperation{
    int add(int num1, int num2){
        return num1 + num2;
    }
    // 1. Method overloading with change in number of parameter
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    // 2. Method overloading with change in data type
    double add(double num1, double num2){
        return num1 + num2;
    }
    // Note: the change in return type doesnot determine overloading
    // method overloading only determine with change in parameter
    // Also, changing the variable name is also not allowed
    // Eg: int add(int a, int b) -> not allowed
    // as function with 2 int is already made
    void add(){
        System.out.println("Invalid Operation");
    }
    // Task
    // Make a function substraction
    // take two int and return int
    // take three double and return double
    // take 1 double and print invalid operation
    // take 1 int and print invalid operation
    // take 2 int and double and return double
    // call these function from MathOperation object
    int substraction(int num1, int num2) {
        return num1 - num2;
    }

    double substraction(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    void substraction(double num1) {
        System.out.println("Invalid Operation");
    }

    void substraction(int num1) {
        System.out.println("Invalid Operation");
    }

    double substraction(int num1, int num2, double num3) {
        return num1 - num2 - num3;
    }
}


// Method Overriding
// When ChildClass has the same function as Parent Class
class Document{
    public void print(String printer){
        System.out.println("Document Printing");
    }
}
// Method Overriding can only be done in child class
class MsWord extends Document{
    @Override
    public void print(String printer){
        System.out.println("Ms word prints");
    }
}
class Office365 extends MsWord{
    boolean internet = true;
    // Overriding can be done in multi layer inheritance
    @Override
    public void print(String printer){
        System.out.println("Online printer");
    }
}

// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object
class Spreadsheet{
    public void addRow(int row){
        System.out.println(row+ "row added");
    }
    public void addColumn(int column){
        System.out.println(column+"column added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType = "Excel";

    @Override
    public void addRow(int row) {
        System.out.println("MsExcel: " + row + " row added");
    }

    @Override
    public void addColumn(int column) {
        System.out.println("MsExcel: " + column + " column added");
    }
}


