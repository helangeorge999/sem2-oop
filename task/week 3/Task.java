import java.util.Scanner;
 
public class Task {
    public static void main(String[] args) {
           
//     Task To Do
 
// 1. Write a JAVA program to find the maximum between three numbers.
Scanner scanner = new Scanner(System.in);
 
// Input three numbers from the user
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int num2 = scanner.nextInt();
System.out.print("Enter the third number: ");
int num3 = scanner.nextInt();

// Find the maximum number
int max = num1;
if (num2 > max) {
    max = num2;
}
if (num3 > max) {
    max = num3;
}

// Print the maximum number
System.out.println("The maximum number is: " + max);

// 2. Write a JAVA program to check whether a number is negative, positive, or zero.
System.out.print("Enter a number: ");
int number3 = scanner.nextInt();

// Check if the number is negative, positive, or zero
if (number3 < 0) {
System.out.println("The number is negative.");
} else if (number3 > 0) {
System.out.println("The number is positive.");
} else {
System.out.println("The number is zero.");
}
// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
System.out.print("Enter a number: ");
int number4 = scanner.nextInt();

// Check if the number is divisible by 5 and 11
if (number4 % 5 == 0 && number4 % 11 == 0) {
System.out.println("The number is divisible by both 5 and 11.");
} else {
System.out.println("The number is not divisible by both 5 and 11.");
}
// 4. Write a JAVA program to check whether a number is even or odd.
System.out.print("Enter a number: ");
int number5 = scanner.nextInt();

// Check if the number is even or odd
if (number5% 2 == 0) {
    System.out.println("The number is even.");
} else {
    System.out.println("The number is odd.");
}


// 5. Write a JAVA program to check whether a year is a leap year or not.

// Hint: if year%4==0; if year%100!==0 ; year%400==0;
System.out.print("Enter a year: ");
int year = scanner.nextInt();

// Check if the year is a leap year
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
System.out.println(year + " is a leap year.");
} else {
System.out.println(year + " is not a leap year.");
}

// 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

System.out.print("Enter an alphabet: ");
char ch = scanner.next().charAt(0);

// Check if the input is a vowel or a consonant
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    System.out.println(ch + " is a vowel.");
} else {
    System.out.println(ch + " is a consonant.");
    }
}
}
    