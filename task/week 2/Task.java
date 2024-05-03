 
import java.util.Scanner;
 
public class Task{
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        int a=0;
        int b= 4;
        int c=10;
        if(a>b && a>b){
            System.out.println("a is maximum number");
        }else if (b>c &&b>a){
                System.out.println("b is maximum number");
        }else{
            System.out.println("c is maximum number");
        }
    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    if(a==0){
        System.out.println("zero");
    }else if (a<0){
            System.out.println("negative");
    }else{
        System.out.println("positive");
    }
    // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    if(b%5==0 && b%11==0){
        System.out.println("is divisible by 5 and 11");
    }else{
        System.out.println("not");
    }
    // 4. Write a JAVA program to check whether a number is even or odd.
    if(b%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
    // 5. Write a JAVA program to check whether a year is a leap year or not.
// Hint: if year%4==0; if year%100!==0 ; year%400==0;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = scanner.nextInt();
 
 
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year.");
} else {
    System.out.println(year + " is not a leap year.");
}
// 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
   
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        ;
 
        ch = Character.toLowerCase(ch);
 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }  
        //     4. Write the ternary operator for question no. 1
 
 
// 5. Write a program to take two integer inputs from the user and print the sum and product of them.
System.out.println("Eneter an number");
int num=scanner.nextInt();
System.out.println("Enter an second number");
int numSec=scanner.nextInt();
int sum=num+numSec;
int product=num/numSec;
System.out.println("sum:"+sum);
System.out.println("product: "+product);
 
// 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
System.out.print("Enter the first integer: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second integer: ");
int num2 = scanner.nextInt();
 
// Calculate the sum and product of the two integers
int sumNums = num1 + num2;
int productNums = num1 * num2;
 
// Calculate the division of the sum and product
double result = (double) sumNums / productNums;
 
// Print the result
System.out.println("The division of the sum and product is: " + result);
// 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.print("Enter your roll number: ");
int rollNumber = scanner.nextInt();
scanner.nextLine(); // Consume the newline character left by nextInt()
System.out.print("Enter your field of interest: ");
String fieldOfInterest = scanner.nextLine();
 
// Print the formatted output
System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
System.out.println("My field of interest is " + fieldOfInterest + ".");
 
// 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
 
        // Calculate area and perimeter of square
        double areaSquare = side * side;
        double perimeterSquare = 4 * side;
 
        System.out.println("Area of the square: " + areaSquare);
        System.out.println("Perimeter of the square: " + perimeterSquare);
 
        // Take input for Simple Interest
        System.out.print("\nEnter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
 
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
 
        // Take input for base and height of triangle
        System.out.print("\nEnter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
 
        // Calculate area of triangle
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaTriangle);
 
        // Take input for side of cube
        System.out.print("\nEnter the side of the cube: ");
        double sideCube = scanner.nextDouble();
 
        // Calculate volume of cube
        double volumeCube = sideCube * sideCube * sideCube;
        System.out.println("Volume of the cube: " + volumeCube);
 
        // Take input for dimensions of cuboid
        System.out.print("\nEnter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();
 
        // Calculate volume of cuboid
        double volumeCuboid = length * breadth * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeCuboid);
 
// 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.print("Enter the length of the rectangle: ");
        double  length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
 
        // Calculate area of the rectangle
        double area = length * breadth;
 
        // Type cast area to int and print
        int areaInt = (int) area;
        System.out.println("Area of the rectangle (type casted to int): " + areaInt);
 
// 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
// a. If equal to or more than 70 -> First Class
 
// b. If more than 59 -> Upper Second Class
 
// c. If more than 49 -> Second class
 
// d. If more than 39 -> Third class and if below than 40 the result is fail.    
System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = scanner.nextInt();
 
        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;
 
        // Calculate percentage
        double percentage = (totalMarks / 4.0);
 
        // Determine the final result based on the percentage
        String result = (percentage >= 70) ? "First Class" :
                        (percentage > 59) ? "Upper Second Class" :
                        (percentage > 49) ? "Second Class" :
                        (percentage > 39) ? "Third Class" : "Fail";
 
        // Print total marks, percentage, and final result
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
 
scanner.close();
}
}